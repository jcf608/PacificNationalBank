@description('PNB Azure landing zone — post-merger deposits and payments')
param environment string = 'dev'
param location string = resourceGroup().location

var namePrefix = 'pnb-${environment}'

resource logAnalytics 'Microsoft.OperationalInsights/workspaces@2022-10-01' = {
  name: '${namePrefix}-logs'
  location: location
  properties: {
    sku: { name: 'PerGB2018' }
    retentionInDays: 30
  }
}

resource serviceBus 'Microsoft.ServiceBus/namespaces@2022-10-01-preview' = {
  name: '${namePrefix}-sb'
  location: location
  sku: { name: 'Standard', tier: 'Standard' }
}

resource mergerTopic 'Microsoft.ServiceBus/namespaces/topics@2022-10-01-preview' = {
  parent: serviceBus
  name: 'merger-reconciliation'
}

resource sqlServer 'Microsoft.Sql/servers@2023-05-01-preview' = {
  name: '${namePrefix}-sql'
  location: location
  properties: {
    administratorLogin: 'pnbadmin'
    version: '12.0'
  }
}

output serviceBusNamespace string = serviceBus.name
output sqlServerFqdn string = sqlServer.properties.fullyQualifiedDomainName
