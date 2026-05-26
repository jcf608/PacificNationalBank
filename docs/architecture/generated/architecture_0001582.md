# Architecture specification — MERGER / treasury (document 1582)

## Context
Post-merger hybrid core documenting treasury across legacy and Azure tiers.

## Container view
```mermaid
flowchart LR
  subgraph MERGER
    L[Legacy IMS/TM]
    A[Azure Services]
  end
  M[MuleSoft Reconciliation]
  L --> M
  A --> M
```

## Component responsibilities
- Component `treasury-comp-0000`: handles slice 0 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0001`: handles slice 1 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0002`: handles slice 2 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0003`: handles slice 3 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0004`: handles slice 4 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0005`: handles slice 5 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0006`: handles slice 6 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0007`: handles slice 7 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0008`: handles slice 8 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0009`: handles slice 9 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0010`: handles slice 10 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0011`: handles slice 11 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0012`: handles slice 12 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0013`: handles slice 13 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0014`: handles slice 14 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0015`: handles slice 15 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0016`: handles slice 16 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0017`: handles slice 17 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0018`: handles slice 18 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0019`: handles slice 19 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0020`: handles slice 20 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0021`: handles slice 21 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0022`: handles slice 22 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0023`: handles slice 23 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0024`: handles slice 24 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0025`: handles slice 25 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0026`: handles slice 26 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0027`: handles slice 27 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0028`: handles slice 28 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0029`: handles slice 29 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0030`: handles slice 30 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0031`: handles slice 31 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0032`: handles slice 32 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0033`: handles slice 33 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0034`: handles slice 34 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0035`: handles slice 35 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0036`: handles slice 36 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0037`: handles slice 37 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0038`: handles slice 38 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0039`: handles slice 39 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0040`: handles slice 40 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0041`: handles slice 41 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0042`: handles slice 42 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0043`: handles slice 43 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0044`: handles slice 44 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0045`: handles slice 45 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0046`: handles slice 46 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0047`: handles slice 47 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0048`: handles slice 48 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0049`: handles slice 49 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0050`: handles slice 50 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0051`: handles slice 51 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0052`: handles slice 52 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0053`: handles slice 53 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0054`: handles slice 54 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0055`: handles slice 55 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0056`: handles slice 56 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0057`: handles slice 57 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0058`: handles slice 58 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0059`: handles slice 59 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0060`: handles slice 60 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0061`: handles slice 61 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0062`: handles slice 62 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0063`: handles slice 63 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0064`: handles slice 64 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0065`: handles slice 65 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0066`: handles slice 66 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0067`: handles slice 67 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0068`: handles slice 68 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0069`: handles slice 69 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0070`: handles slice 70 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0071`: handles slice 71 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0072`: handles slice 72 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0073`: handles slice 73 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0074`: handles slice 74 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0075`: handles slice 75 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0076`: handles slice 76 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0077`: handles slice 77 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0078`: handles slice 78 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0079`: handles slice 79 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0080`: handles slice 80 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0081`: handles slice 81 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0082`: handles slice 82 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0083`: handles slice 83 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0084`: handles slice 84 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0085`: handles slice 85 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0086`: handles slice 86 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0087`: handles slice 87 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0088`: handles slice 88 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0089`: handles slice 89 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0090`: handles slice 90 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0091`: handles slice 91 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0092`: handles slice 92 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0093`: handles slice 93 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0094`: handles slice 94 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0095`: handles slice 95 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0096`: handles slice 96 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0097`: handles slice 97 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0098`: handles slice 98 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0099`: handles slice 99 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0100`: handles slice 100 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0101`: handles slice 101 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0102`: handles slice 102 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0103`: handles slice 103 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0104`: handles slice 104 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0105`: handles slice 105 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0106`: handles slice 106 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0107`: handles slice 107 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0108`: handles slice 108 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0109`: handles slice 109 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0110`: handles slice 110 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0111`: handles slice 111 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0112`: handles slice 112 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0113`: handles slice 113 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0114`: handles slice 114 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0115`: handles slice 115 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0116`: handles slice 116 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0117`: handles slice 117 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0118`: handles slice 118 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0119`: handles slice 119 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0120`: handles slice 120 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0121`: handles slice 121 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0122`: handles slice 122 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0123`: handles slice 123 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0124`: handles slice 124 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0125`: handles slice 125 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0126`: handles slice 126 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0127`: handles slice 127 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0128`: handles slice 128 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0129`: handles slice 129 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0130`: handles slice 130 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0131`: handles slice 131 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0132`: handles slice 132 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0133`: handles slice 133 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0134`: handles slice 134 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0135`: handles slice 135 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0136`: handles slice 136 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0137`: handles slice 137 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0138`: handles slice 138 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0139`: handles slice 139 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0140`: handles slice 140 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0141`: handles slice 141 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0142`: handles slice 142 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0143`: handles slice 143 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0144`: handles slice 144 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0145`: handles slice 145 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0146`: handles slice 146 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0147`: handles slice 147 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0148`: handles slice 148 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0149`: handles slice 149 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0150`: handles slice 150 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0151`: handles slice 151 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0152`: handles slice 152 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0153`: handles slice 153 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0154`: handles slice 154 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0155`: handles slice 155 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0156`: handles slice 156 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0157`: handles slice 157 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0158`: handles slice 158 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0159`: handles slice 159 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0160`: handles slice 160 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0161`: handles slice 161 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0162`: handles slice 162 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0163`: handles slice 163 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0164`: handles slice 164 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0165`: handles slice 165 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0166`: handles slice 166 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0167`: handles slice 167 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0168`: handles slice 168 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0169`: handles slice 169 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0170`: handles slice 170 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0171`: handles slice 171 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0172`: handles slice 172 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0173`: handles slice 173 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0174`: handles slice 174 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0175`: handles slice 175 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0176`: handles slice 176 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0177`: handles slice 177 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0178`: handles slice 178 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0179`: handles slice 179 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0180`: handles slice 180 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0181`: handles slice 181 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0182`: handles slice 182 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0183`: handles slice 183 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0184`: handles slice 184 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0185`: handles slice 185 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0186`: handles slice 186 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0187`: handles slice 187 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0188`: handles slice 188 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0189`: handles slice 189 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0190`: handles slice 190 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0191`: handles slice 191 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0192`: handles slice 192 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0193`: handles slice 193 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0194`: handles slice 194 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0195`: handles slice 195 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0196`: handles slice 196 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0197`: handles slice 197 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0198`: handles slice 198 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0199`: handles slice 199 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0200`: handles slice 200 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0201`: handles slice 201 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0202`: handles slice 202 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0203`: handles slice 203 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0204`: handles slice 204 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0205`: handles slice 205 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0206`: handles slice 206 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0207`: handles slice 207 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0208`: handles slice 208 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0209`: handles slice 209 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0210`: handles slice 210 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0211`: handles slice 211 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0212`: handles slice 212 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0213`: handles slice 213 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0214`: handles slice 214 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0215`: handles slice 215 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0216`: handles slice 216 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0217`: handles slice 217 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0218`: handles slice 218 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0219`: handles slice 219 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0220`: handles slice 220 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0221`: handles slice 221 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0222`: handles slice 222 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0223`: handles slice 223 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0224`: handles slice 224 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0225`: handles slice 225 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0226`: handles slice 226 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0227`: handles slice 227 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0228`: handles slice 228 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0229`: handles slice 229 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0230`: handles slice 230 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0231`: handles slice 231 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0232`: handles slice 232 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0233`: handles slice 233 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0234`: handles slice 234 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0235`: handles slice 235 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0236`: handles slice 236 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0237`: handles slice 237 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0238`: handles slice 238 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0239`: handles slice 239 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0240`: handles slice 240 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0241`: handles slice 241 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0242`: handles slice 242 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0243`: handles slice 243 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0244`: handles slice 244 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0245`: handles slice 245 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0246`: handles slice 246 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0247`: handles slice 247 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0248`: handles slice 248 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0249`: handles slice 249 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0250`: handles slice 250 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0251`: handles slice 251 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0252`: handles slice 252 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0253`: handles slice 253 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0254`: handles slice 254 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0255`: handles slice 255 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0256`: handles slice 256 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0257`: handles slice 257 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0258`: handles slice 258 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0259`: handles slice 259 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0260`: handles slice 260 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0261`: handles slice 261 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0262`: handles slice 262 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0263`: handles slice 263 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0264`: handles slice 264 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0265`: handles slice 265 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0266`: handles slice 266 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0267`: handles slice 267 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0268`: handles slice 268 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0269`: handles slice 269 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0270`: handles slice 270 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0271`: handles slice 271 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0272`: handles slice 272 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0273`: handles slice 273 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0274`: handles slice 274 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0275`: handles slice 275 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0276`: handles slice 276 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0277`: handles slice 277 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0278`: handles slice 278 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0279`: handles slice 279 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0280`: handles slice 280 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0281`: handles slice 281 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0282`: handles slice 282 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0283`: handles slice 283 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0284`: handles slice 284 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0285`: handles slice 285 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0286`: handles slice 286 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0287`: handles slice 287 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0288`: handles slice 288 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0289`: handles slice 289 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0290`: handles slice 290 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0291`: handles slice 291 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0292`: handles slice 292 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0293`: handles slice 293 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0294`: handles slice 294 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0295`: handles slice 295 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0296`: handles slice 296 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0297`: handles slice 297 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0298`: handles slice 298 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0299`: handles slice 299 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0300`: handles slice 300 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0301`: handles slice 301 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0302`: handles slice 302 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0303`: handles slice 303 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0304`: handles slice 304 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0305`: handles slice 305 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0306`: handles slice 306 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0307`: handles slice 307 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0308`: handles slice 308 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0309`: handles slice 309 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0310`: handles slice 310 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0311`: handles slice 311 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0312`: handles slice 312 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0313`: handles slice 313 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0314`: handles slice 314 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0315`: handles slice 315 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0316`: handles slice 316 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0317`: handles slice 317 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0318`: handles slice 318 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0319`: handles slice 319 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0320`: handles slice 320 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0321`: handles slice 321 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0322`: handles slice 322 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0323`: handles slice 323 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0324`: handles slice 324 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0325`: handles slice 325 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0326`: handles slice 326 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0327`: handles slice 327 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0328`: handles slice 328 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0329`: handles slice 329 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0330`: handles slice 330 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0331`: handles slice 331 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0332`: handles slice 332 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0333`: handles slice 333 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0334`: handles slice 334 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0335`: handles slice 335 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0336`: handles slice 336 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0337`: handles slice 337 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0338`: handles slice 338 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0339`: handles slice 339 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0340`: handles slice 340 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0341`: handles slice 341 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0342`: handles slice 342 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0343`: handles slice 343 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0344`: handles slice 344 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0345`: handles slice 345 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0346`: handles slice 346 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0347`: handles slice 347 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0348`: handles slice 348 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0349`: handles slice 349 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0350`: handles slice 350 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0351`: handles slice 351 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0352`: handles slice 352 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0353`: handles slice 353 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0354`: handles slice 354 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0355`: handles slice 355 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0356`: handles slice 356 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0357`: handles slice 357 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0358`: handles slice 358 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0359`: handles slice 359 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0360`: handles slice 360 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0361`: handles slice 361 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0362`: handles slice 362 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0363`: handles slice 363 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0364`: handles slice 364 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0365`: handles slice 365 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0366`: handles slice 366 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0367`: handles slice 367 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0368`: handles slice 368 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0369`: handles slice 369 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0370`: handles slice 370 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0371`: handles slice 371 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0372`: handles slice 372 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0373`: handles slice 373 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0374`: handles slice 374 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0375`: handles slice 375 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0376`: handles slice 376 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0377`: handles slice 377 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0378`: handles slice 378 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0379`: handles slice 379 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0380`: handles slice 380 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0381`: handles slice 381 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0382`: handles slice 382 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0383`: handles slice 383 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0384`: handles slice 384 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0385`: handles slice 385 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0386`: handles slice 386 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0387`: handles slice 387 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0388`: handles slice 388 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0389`: handles slice 389 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0390`: handles slice 390 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0391`: handles slice 391 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0392`: handles slice 392 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0393`: handles slice 393 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0394`: handles slice 394 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0395`: handles slice 395 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0396`: handles slice 396 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0397`: handles slice 397 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0398`: handles slice 398 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0399`: handles slice 399 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0400`: handles slice 400 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0401`: handles slice 401 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0402`: handles slice 402 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0403`: handles slice 403 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0404`: handles slice 404 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0405`: handles slice 405 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0406`: handles slice 406 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0407`: handles slice 407 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0408`: handles slice 408 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0409`: handles slice 409 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0410`: handles slice 410 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0411`: handles slice 411 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0412`: handles slice 412 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0413`: handles slice 413 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0414`: handles slice 414 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0415`: handles slice 415 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0416`: handles slice 416 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0417`: handles slice 417 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0418`: handles slice 418 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0419`: handles slice 419 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0420`: handles slice 420 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0421`: handles slice 421 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0422`: handles slice 422 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0423`: handles slice 423 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0424`: handles slice 424 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0425`: handles slice 425 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0426`: handles slice 426 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0427`: handles slice 427 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0428`: handles slice 428 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0429`: handles slice 429 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0430`: handles slice 430 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0431`: handles slice 431 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0432`: handles slice 432 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0433`: handles slice 433 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0434`: handles slice 434 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0435`: handles slice 435 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0436`: handles slice 436 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0437`: handles slice 437 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0438`: handles slice 438 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0439`: handles slice 439 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0440`: handles slice 440 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0441`: handles slice 441 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0442`: handles slice 442 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0443`: handles slice 443 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0444`: handles slice 444 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0445`: handles slice 445 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0446`: handles slice 446 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0447`: handles slice 447 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0448`: handles slice 448 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0449`: handles slice 449 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0450`: handles slice 450 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0451`: handles slice 451 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0452`: handles slice 452 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0453`: handles slice 453 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0454`: handles slice 454 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0455`: handles slice 455 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0456`: handles slice 456 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0457`: handles slice 457 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0458`: handles slice 458 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0459`: handles slice 459 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0460`: handles slice 460 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0461`: handles slice 461 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0462`: handles slice 462 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0463`: handles slice 463 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0464`: handles slice 464 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0465`: handles slice 465 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0466`: handles slice 466 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0467`: handles slice 467 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0468`: handles slice 468 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0469`: handles slice 469 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0470`: handles slice 470 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0471`: handles slice 471 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0472`: handles slice 472 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0473`: handles slice 473 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0474`: handles slice 474 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0475`: handles slice 475 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0476`: handles slice 476 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0477`: handles slice 477 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0478`: handles slice 478 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0479`: handles slice 479 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0480`: handles slice 480 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0481`: handles slice 481 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0482`: handles slice 482 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0483`: handles slice 483 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0484`: handles slice 484 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0485`: handles slice 485 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0486`: handles slice 486 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0487`: handles slice 487 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0488`: handles slice 488 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0489`: handles slice 489 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0490`: handles slice 490 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0491`: handles slice 491 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0492`: handles slice 492 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0493`: handles slice 493 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0494`: handles slice 494 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0495`: handles slice 495 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0496`: handles slice 496 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0497`: handles slice 497 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0498`: handles slice 498 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0499`: handles slice 499 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0500`: handles slice 500 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0501`: handles slice 501 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0502`: handles slice 502 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0503`: handles slice 503 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0504`: handles slice 504 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0505`: handles slice 505 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0506`: handles slice 506 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0507`: handles slice 507 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0508`: handles slice 508 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0509`: handles slice 509 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0510`: handles slice 510 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0511`: handles slice 511 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0512`: handles slice 512 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0513`: handles slice 513 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0514`: handles slice 514 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0515`: handles slice 515 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0516`: handles slice 516 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0517`: handles slice 517 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0518`: handles slice 518 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0519`: handles slice 519 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0520`: handles slice 520 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0521`: handles slice 521 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0522`: handles slice 522 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0523`: handles slice 523 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0524`: handles slice 524 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0525`: handles slice 525 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0526`: handles slice 526 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0527`: handles slice 527 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0528`: handles slice 528 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0529`: handles slice 529 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0530`: handles slice 530 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0531`: handles slice 531 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0532`: handles slice 532 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0533`: handles slice 533 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0534`: handles slice 534 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0535`: handles slice 535 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0536`: handles slice 536 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0537`: handles slice 537 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0538`: handles slice 538 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0539`: handles slice 539 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0540`: handles slice 540 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0541`: handles slice 541 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0542`: handles slice 542 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0543`: handles slice 543 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0544`: handles slice 544 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0545`: handles slice 545 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0546`: handles slice 546 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0547`: handles slice 547 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0548`: handles slice 548 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0549`: handles slice 549 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0550`: handles slice 550 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0551`: handles slice 551 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0552`: handles slice 552 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0553`: handles slice 553 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0554`: handles slice 554 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0555`: handles slice 555 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0556`: handles slice 556 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0557`: handles slice 557 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0558`: handles slice 558 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0559`: handles slice 559 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0560`: handles slice 560 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0561`: handles slice 561 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0562`: handles slice 562 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0563`: handles slice 563 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0564`: handles slice 564 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0565`: handles slice 565 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0566`: handles slice 566 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0567`: handles slice 567 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0568`: handles slice 568 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0569`: handles slice 569 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0570`: handles slice 570 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0571`: handles slice 571 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0572`: handles slice 572 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0573`: handles slice 573 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0574`: handles slice 574 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0575`: handles slice 575 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0576`: handles slice 576 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0577`: handles slice 577 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0578`: handles slice 578 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0579`: handles slice 579 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0580`: handles slice 580 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0581`: handles slice 581 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0582`: handles slice 582 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0583`: handles slice 583 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0584`: handles slice 584 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0585`: handles slice 585 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0586`: handles slice 586 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0587`: handles slice 587 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0588`: handles slice 588 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0589`: handles slice 589 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0590`: handles slice 590 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0591`: handles slice 591 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0592`: handles slice 592 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0593`: handles slice 593 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0594`: handles slice 594 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0595`: handles slice 595 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0596`: handles slice 596 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0597`: handles slice 597 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0598`: handles slice 598 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0599`: handles slice 599 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0600`: handles slice 600 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0601`: handles slice 601 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0602`: handles slice 602 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0603`: handles slice 603 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0604`: handles slice 604 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0605`: handles slice 605 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0606`: handles slice 606 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0607`: handles slice 607 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0608`: handles slice 608 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0609`: handles slice 609 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0610`: handles slice 610 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0611`: handles slice 611 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0612`: handles slice 612 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0613`: handles slice 613 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0614`: handles slice 614 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0615`: handles slice 615 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0616`: handles slice 616 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0617`: handles slice 617 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0618`: handles slice 618 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0619`: handles slice 619 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0620`: handles slice 620 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0621`: handles slice 621 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0622`: handles slice 622 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0623`: handles slice 623 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0624`: handles slice 624 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0625`: handles slice 625 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0626`: handles slice 626 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0627`: handles slice 627 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0628`: handles slice 628 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0629`: handles slice 629 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0630`: handles slice 630 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0631`: handles slice 631 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0632`: handles slice 632 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0633`: handles slice 633 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0634`: handles slice 634 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0635`: handles slice 635 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0636`: handles slice 636 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0637`: handles slice 637 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0638`: handles slice 638 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0639`: handles slice 639 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0640`: handles slice 640 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0641`: handles slice 641 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0642`: handles slice 642 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0643`: handles slice 643 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0644`: handles slice 644 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0645`: handles slice 645 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0646`: handles slice 646 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0647`: handles slice 647 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0648`: handles slice 648 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.
- Component `treasury-comp-0649`: handles slice 649 of treasury posting validation, idempotency keys, and compensating transactions on MERGER.

## Data classification
| Field | Classification | Retention |
|-------|----------------|-----------|
| field_000 | confidential | 7 years |
| field_001 | confidential | 7 years |
| field_002 | confidential | 7 years |
| field_003 | confidential | 7 years |
| field_004 | confidential | 7 years |
| field_005 | confidential | 7 years |
| field_006 | confidential | 7 years |
| field_007 | confidential | 7 years |
| field_008 | confidential | 7 years |
| field_009 | confidential | 7 years |
| field_010 | confidential | 7 years |
| field_011 | confidential | 7 years |
| field_012 | confidential | 7 years |
| field_013 | confidential | 7 years |
| field_014 | confidential | 7 years |
| field_015 | confidential | 7 years |
| field_016 | confidential | 7 years |
| field_017 | confidential | 7 years |
| field_018 | confidential | 7 years |
| field_019 | confidential | 7 years |
| field_020 | confidential | 7 years |
| field_021 | confidential | 7 years |
| field_022 | confidential | 7 years |
| field_023 | confidential | 7 years |
| field_024 | confidential | 7 years |
| field_025 | confidential | 7 years |
| field_026 | confidential | 7 years |
| field_027 | confidential | 7 years |
| field_028 | confidential | 7 years |
| field_029 | confidential | 7 years |
| field_030 | confidential | 7 years |
| field_031 | confidential | 7 years |
| field_032 | confidential | 7 years |
| field_033 | confidential | 7 years |
| field_034 | confidential | 7 years |
| field_035 | confidential | 7 years |
| field_036 | confidential | 7 years |
| field_037 | confidential | 7 years |
| field_038 | confidential | 7 years |
| field_039 | confidential | 7 years |

## Non-functional requirements
1. Throughput target TPS-0000: 2109 sustained for treasury.
1. Throughput target TPS-0001: 6083 sustained for treasury.
1. Throughput target TPS-0002: 5674 sustained for treasury.
1. Throughput target TPS-0003: 1904 sustained for treasury.
1. Throughput target TPS-0004: 3693 sustained for treasury.
1. Throughput target TPS-0005: 7547 sustained for treasury.
1. Throughput target TPS-0006: 3253 sustained for treasury.
1. Throughput target TPS-0007: 2424 sustained for treasury.
1. Throughput target TPS-0008: 6598 sustained for treasury.
1. Throughput target TPS-0009: 2022 sustained for treasury.
1. Throughput target TPS-0010: 7333 sustained for treasury.
1. Throughput target TPS-0011: 2810 sustained for treasury.
1. Throughput target TPS-0012: 2493 sustained for treasury.
1. Throughput target TPS-0013: 1177 sustained for treasury.
1. Throughput target TPS-0014: 6294 sustained for treasury.
1. Throughput target TPS-0015: 3098 sustained for treasury.
1. Throughput target TPS-0016: 7058 sustained for treasury.
1. Throughput target TPS-0017: 364 sustained for treasury.
1. Throughput target TPS-0018: 929 sustained for treasury.
1. Throughput target TPS-0019: 6708 sustained for treasury.
1. Throughput target TPS-0020: 800 sustained for treasury.
1. Throughput target TPS-0021: 2507 sustained for treasury.
1. Throughput target TPS-0022: 3705 sustained for treasury.
1. Throughput target TPS-0023: 4154 sustained for treasury.
1. Throughput target TPS-0024: 7720 sustained for treasury.
1. Throughput target TPS-0025: 1827 sustained for treasury.
1. Throughput target TPS-0026: 5153 sustained for treasury.
1. Throughput target TPS-0027: 926 sustained for treasury.
1. Throughput target TPS-0028: 2052 sustained for treasury.
1. Throughput target TPS-0029: 4543 sustained for treasury.
1. Throughput target TPS-0030: 6000 sustained for treasury.
1. Throughput target TPS-0031: 6445 sustained for treasury.
1. Throughput target TPS-0032: 1544 sustained for treasury.
1. Throughput target TPS-0033: 3562 sustained for treasury.
1. Throughput target TPS-0034: 5346 sustained for treasury.
1. Throughput target TPS-0035: 7126 sustained for treasury.
1. Throughput target TPS-0036: 7431 sustained for treasury.
1. Throughput target TPS-0037: 6016 sustained for treasury.
1. Throughput target TPS-0038: 5487 sustained for treasury.
1. Throughput target TPS-0039: 3260 sustained for treasury.
1. Throughput target TPS-0040: 7255 sustained for treasury.
1. Throughput target TPS-0041: 3581 sustained for treasury.
1. Throughput target TPS-0042: 450 sustained for treasury.
1. Throughput target TPS-0043: 1489 sustained for treasury.
1. Throughput target TPS-0044: 1888 sustained for treasury.
1. Throughput target TPS-0045: 6813 sustained for treasury.
1. Throughput target TPS-0046: 7069 sustained for treasury.
1. Throughput target TPS-0047: 5749 sustained for treasury.
1. Throughput target TPS-0048: 1044 sustained for treasury.
1. Throughput target TPS-0049: 1580 sustained for treasury.
1. Throughput target TPS-0050: 310 sustained for treasury.
1. Throughput target TPS-0051: 7878 sustained for treasury.
1. Throughput target TPS-0052: 1177 sustained for treasury.
1. Throughput target TPS-0053: 2589 sustained for treasury.
1. Throughput target TPS-0054: 7023 sustained for treasury.
1. Throughput target TPS-0055: 2472 sustained for treasury.
1. Throughput target TPS-0056: 6327 sustained for treasury.
1. Throughput target TPS-0057: 2957 sustained for treasury.
1. Throughput target TPS-0058: 6010 sustained for treasury.
1. Throughput target TPS-0059: 4438 sustained for treasury.
