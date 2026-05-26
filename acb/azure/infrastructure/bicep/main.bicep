@description('ACB Azure landing zone — mirror of PNB with separate data residency')
param environment string = 'dev'
param location string = resourceGroup().location

var namePrefix = 'acb-${environment}'

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

resource sqlServer 'Microsoft.Sql/servers@2023-05-01-preview' = {
  name: '${namePrefix}-sql'
  location: location
  properties: {
    administratorLogin: 'acbadm'
    version: '12.0'
  }
}

output serviceBusNamespace string = serviceBus.name
output sqlServerFqdn string = sqlServer.properties.fullyQualifiedDomainName
