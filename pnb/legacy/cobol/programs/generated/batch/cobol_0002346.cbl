      ******************************************************************
      * PNBGEN002346.cbl — Generated batch for escrow
      * Pacific National Bank
      ******************************************************************
       IDENTIFICATION DIVISION.
       PROGRAM-ID. PNBGEN002346.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-DOMAIN               PIC X(20) VALUE 'ESCROW'.
       01  WS-VAR-0000            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0001            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0002            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0003            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0004            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0005            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0006            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0007            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0008            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0009            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0010            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0011            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0012            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0013            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0014            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0015            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0016            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0017            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0018            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0019            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0020            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0021            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0022            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0023            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0024            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0025            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0026            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0027            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0028            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0029            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0030            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0031            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0032            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0033            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0034            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0035            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0036            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0037            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0038            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0039            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0040            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0041            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0042            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0043            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0044            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0045            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0046            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0047            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0048            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0049            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0050            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0051            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0052            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0053            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0054            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0055            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0056            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0057            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0058            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0059            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0060            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0061            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0062            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0063            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0064            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0065            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0066            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0067            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0068            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0069            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0070            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0071            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0072            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0073            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0074            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0075            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0076            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0077            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0078            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0079            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0080            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0081            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0082            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0083            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0084            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0085            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0086            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0087            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0088            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0089            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0090            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0091            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0092            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0093            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0094            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0095            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0096            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0097            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0098            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0099            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0100            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0101            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0102            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0103            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0104            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0105            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0106            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0107            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0108            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0109            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0110            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0111            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0112            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0113            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0114            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0115            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0116            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0117            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0118            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0119            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0120            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0121            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0122            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0123            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0124            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0125            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0126            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0127            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0128            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0129            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0130            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0131            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0132            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0133            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0134            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0135            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0136            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0137            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0138            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0139            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0140            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0141            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0142            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0143            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0144            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0145            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0146            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0147            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0148            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0149            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0150            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0151            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0152            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0153            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0154            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0155            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0156            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0157            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0158            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0159            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0160            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0161            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0162            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0163            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0164            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0165            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0166            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0167            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0168            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0169            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0170            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0171            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0172            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0173            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0174            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0175            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0176            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0177            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0178            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0179            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0180            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0181            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0182            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0183            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0184            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0185            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0186            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0187            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0188            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0189            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0190            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0191            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0192            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0193            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0194            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0195            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0196            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0197            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0198            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0199            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0200            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0201            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0202            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0203            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0204            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0205            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0206            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0207            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0208            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0209            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0210            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0211            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0212            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0213            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0214            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0215            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0216            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0217            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0218            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0219            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0220            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0221            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0222            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0223            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0224            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0225            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0226            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0227            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0228            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0229            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0230            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0231            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0232            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0233            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0234            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0235            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0236            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0237            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0238            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0239            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0240            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0241            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0242            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0243            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0244            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0245            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0246            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0247            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0248            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0249            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0250            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0251            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0252            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0253            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0254            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0255            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0256            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0257            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0258            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0259            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0260            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0261            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0262            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0263            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0264            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0265            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0266            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0267            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0268            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0269            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0270            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0271            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0272            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0273            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0274            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0275            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0276            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0277            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0278            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0279            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0280            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0281            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0282            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0283            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0284            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0285            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0286            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0287            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0288            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0289            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0290            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0291            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0292            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0293            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0294            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0295            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0296            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0297            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0298            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0299            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0300            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0301            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0302            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0303            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0304            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0305            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0306            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0307            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0308            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0309            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0310            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0311            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0312            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0313            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0314            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0315            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0316            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0317            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0318            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0319            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0320            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0321            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0322            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0323            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0324            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0325            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0326            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0327            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0328            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0329            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0330            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0331            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0332            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0333            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0334            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0335            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0336            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0337            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0338            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0339            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0340            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0341            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0342            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0343            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0344            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0345            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0346            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0347            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0348            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0349            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0350            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0351            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0352            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0353            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0354            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0355            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0356            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0357            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0358            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0359            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0360            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0361            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0362            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0363            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0364            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0365            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0366            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0367            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0368            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0369            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0370            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0371            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0372            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0373            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0374            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0375            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0376            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0377            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0378            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0379            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0380            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0381            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0382            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0383            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0384            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0385            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0386            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0387            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0388            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0389            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0390            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0391            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0392            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0393            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0394            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0395            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0396            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0397            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0398            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0399            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0400            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0401            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0402            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0403            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0404            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0405            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0406            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0407            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0408            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0409            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0410            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0411            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0412            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0413            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0414            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0415            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0416            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0417            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0418            PIC S9(13)V99 COMP-3.
       01  WS-VAR-0419            PIC S9(13)V99 COMP-3.
       PROCEDURE DIVISION.
       0000-PROCESS.
           ADD 1 TO WS-VAR-0000
           ADD 1 TO WS-VAR-0001
           ADD 1 TO WS-VAR-0002
           ADD 1 TO WS-VAR-0003
           ADD 1 TO WS-VAR-0004
           ADD 1 TO WS-VAR-0005
           ADD 1 TO WS-VAR-0006
           ADD 1 TO WS-VAR-0007
           ADD 1 TO WS-VAR-0008
           ADD 1 TO WS-VAR-0009
           ADD 1 TO WS-VAR-0010
           ADD 1 TO WS-VAR-0011
           ADD 1 TO WS-VAR-0012
           ADD 1 TO WS-VAR-0013
           ADD 1 TO WS-VAR-0014
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           CONTINUE.
       0001-PROCESS.
           ADD 1 TO WS-VAR-0003
           ADD 1 TO WS-VAR-0004
           ADD 1 TO WS-VAR-0005
           ADD 1 TO WS-VAR-0006
           ADD 1 TO WS-VAR-0007
           ADD 1 TO WS-VAR-0008
           ADD 1 TO WS-VAR-0009
           ADD 1 TO WS-VAR-0010
           ADD 1 TO WS-VAR-0011
           ADD 1 TO WS-VAR-0012
           ADD 1 TO WS-VAR-0013
           ADD 1 TO WS-VAR-0014
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           CONTINUE.
       0002-PROCESS.
           ADD 1 TO WS-VAR-0006
           ADD 1 TO WS-VAR-0007
           ADD 1 TO WS-VAR-0008
           ADD 1 TO WS-VAR-0009
           ADD 1 TO WS-VAR-0010
           ADD 1 TO WS-VAR-0011
           ADD 1 TO WS-VAR-0012
           ADD 1 TO WS-VAR-0013
           ADD 1 TO WS-VAR-0014
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           CONTINUE.
       0003-PROCESS.
           ADD 1 TO WS-VAR-0009
           ADD 1 TO WS-VAR-0010
           ADD 1 TO WS-VAR-0011
           ADD 1 TO WS-VAR-0012
           ADD 1 TO WS-VAR-0013
           ADD 1 TO WS-VAR-0014
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           CONTINUE.
       0004-PROCESS.
           ADD 1 TO WS-VAR-0012
           ADD 1 TO WS-VAR-0013
           ADD 1 TO WS-VAR-0014
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           CONTINUE.
       0005-PROCESS.
           ADD 1 TO WS-VAR-0015
           ADD 1 TO WS-VAR-0016
           ADD 1 TO WS-VAR-0017
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           CONTINUE.
       0006-PROCESS.
           ADD 1 TO WS-VAR-0018
           ADD 1 TO WS-VAR-0019
           ADD 1 TO WS-VAR-0020
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           CONTINUE.
       0007-PROCESS.
           ADD 1 TO WS-VAR-0021
           ADD 1 TO WS-VAR-0022
           ADD 1 TO WS-VAR-0023
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           CONTINUE.
       0008-PROCESS.
           ADD 1 TO WS-VAR-0024
           ADD 1 TO WS-VAR-0025
           ADD 1 TO WS-VAR-0026
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           CONTINUE.
       0009-PROCESS.
           ADD 1 TO WS-VAR-0027
           ADD 1 TO WS-VAR-0028
           ADD 1 TO WS-VAR-0029
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           CONTINUE.
       0010-PROCESS.
           ADD 1 TO WS-VAR-0030
           ADD 1 TO WS-VAR-0031
           ADD 1 TO WS-VAR-0032
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           CONTINUE.
       0011-PROCESS.
           ADD 1 TO WS-VAR-0033
           ADD 1 TO WS-VAR-0034
           ADD 1 TO WS-VAR-0035
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           CONTINUE.
       0012-PROCESS.
           ADD 1 TO WS-VAR-0036
           ADD 1 TO WS-VAR-0037
           ADD 1 TO WS-VAR-0038
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           CONTINUE.
       0013-PROCESS.
           ADD 1 TO WS-VAR-0039
           ADD 1 TO WS-VAR-0040
           ADD 1 TO WS-VAR-0041
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           CONTINUE.
       0014-PROCESS.
           ADD 1 TO WS-VAR-0042
           ADD 1 TO WS-VAR-0043
           ADD 1 TO WS-VAR-0044
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           CONTINUE.
       0015-PROCESS.
           ADD 1 TO WS-VAR-0045
           ADD 1 TO WS-VAR-0046
           ADD 1 TO WS-VAR-0047
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           CONTINUE.
       0016-PROCESS.
           ADD 1 TO WS-VAR-0048
           ADD 1 TO WS-VAR-0049
           ADD 1 TO WS-VAR-0050
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           CONTINUE.
       0017-PROCESS.
           ADD 1 TO WS-VAR-0051
           ADD 1 TO WS-VAR-0052
           ADD 1 TO WS-VAR-0053
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           CONTINUE.
       0018-PROCESS.
           ADD 1 TO WS-VAR-0054
           ADD 1 TO WS-VAR-0055
           ADD 1 TO WS-VAR-0056
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           CONTINUE.
       0019-PROCESS.
           ADD 1 TO WS-VAR-0057
           ADD 1 TO WS-VAR-0058
           ADD 1 TO WS-VAR-0059
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           CONTINUE.
       0020-PROCESS.
           ADD 1 TO WS-VAR-0060
           ADD 1 TO WS-VAR-0061
           ADD 1 TO WS-VAR-0062
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           CONTINUE.
       0021-PROCESS.
           ADD 1 TO WS-VAR-0063
           ADD 1 TO WS-VAR-0064
           ADD 1 TO WS-VAR-0065
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           CONTINUE.
       0022-PROCESS.
           ADD 1 TO WS-VAR-0066
           ADD 1 TO WS-VAR-0067
           ADD 1 TO WS-VAR-0068
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           CONTINUE.
       0023-PROCESS.
           ADD 1 TO WS-VAR-0069
           ADD 1 TO WS-VAR-0070
           ADD 1 TO WS-VAR-0071
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           CONTINUE.
       0024-PROCESS.
           ADD 1 TO WS-VAR-0072
           ADD 1 TO WS-VAR-0073
           ADD 1 TO WS-VAR-0074
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           CONTINUE.
       0025-PROCESS.
           ADD 1 TO WS-VAR-0075
           ADD 1 TO WS-VAR-0076
           ADD 1 TO WS-VAR-0077
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           CONTINUE.
       0026-PROCESS.
           ADD 1 TO WS-VAR-0078
           ADD 1 TO WS-VAR-0079
           ADD 1 TO WS-VAR-0080
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           CONTINUE.
       0027-PROCESS.
           ADD 1 TO WS-VAR-0081
           ADD 1 TO WS-VAR-0082
           ADD 1 TO WS-VAR-0083
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           CONTINUE.
       0028-PROCESS.
           ADD 1 TO WS-VAR-0084
           ADD 1 TO WS-VAR-0085
           ADD 1 TO WS-VAR-0086
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           CONTINUE.
       0029-PROCESS.
           ADD 1 TO WS-VAR-0087
           ADD 1 TO WS-VAR-0088
           ADD 1 TO WS-VAR-0089
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           CONTINUE.
       0030-PROCESS.
           ADD 1 TO WS-VAR-0090
           ADD 1 TO WS-VAR-0091
           ADD 1 TO WS-VAR-0092
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           CONTINUE.
       0031-PROCESS.
           ADD 1 TO WS-VAR-0093
           ADD 1 TO WS-VAR-0094
           ADD 1 TO WS-VAR-0095
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           CONTINUE.
       0032-PROCESS.
           ADD 1 TO WS-VAR-0096
           ADD 1 TO WS-VAR-0097
           ADD 1 TO WS-VAR-0098
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           CONTINUE.
       0033-PROCESS.
           ADD 1 TO WS-VAR-0099
           ADD 1 TO WS-VAR-0100
           ADD 1 TO WS-VAR-0101
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           CONTINUE.
       0034-PROCESS.
           ADD 1 TO WS-VAR-0102
           ADD 1 TO WS-VAR-0103
           ADD 1 TO WS-VAR-0104
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           CONTINUE.
       0035-PROCESS.
           ADD 1 TO WS-VAR-0105
           ADD 1 TO WS-VAR-0106
           ADD 1 TO WS-VAR-0107
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           CONTINUE.
       0036-PROCESS.
           ADD 1 TO WS-VAR-0108
           ADD 1 TO WS-VAR-0109
           ADD 1 TO WS-VAR-0110
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           CONTINUE.
       0037-PROCESS.
           ADD 1 TO WS-VAR-0111
           ADD 1 TO WS-VAR-0112
           ADD 1 TO WS-VAR-0113
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           CONTINUE.
       0038-PROCESS.
           ADD 1 TO WS-VAR-0114
           ADD 1 TO WS-VAR-0115
           ADD 1 TO WS-VAR-0116
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           CONTINUE.
       0039-PROCESS.
           ADD 1 TO WS-VAR-0117
           ADD 1 TO WS-VAR-0118
           ADD 1 TO WS-VAR-0119
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           CONTINUE.
       0040-PROCESS.
           ADD 1 TO WS-VAR-0120
           ADD 1 TO WS-VAR-0121
           ADD 1 TO WS-VAR-0122
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           CONTINUE.
       0041-PROCESS.
           ADD 1 TO WS-VAR-0123
           ADD 1 TO WS-VAR-0124
           ADD 1 TO WS-VAR-0125
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           CONTINUE.
       0042-PROCESS.
           ADD 1 TO WS-VAR-0126
           ADD 1 TO WS-VAR-0127
           ADD 1 TO WS-VAR-0128
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           CONTINUE.
       0043-PROCESS.
           ADD 1 TO WS-VAR-0129
           ADD 1 TO WS-VAR-0130
           ADD 1 TO WS-VAR-0131
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           CONTINUE.
       0044-PROCESS.
           ADD 1 TO WS-VAR-0132
           ADD 1 TO WS-VAR-0133
           ADD 1 TO WS-VAR-0134
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           CONTINUE.
       0045-PROCESS.
           ADD 1 TO WS-VAR-0135
           ADD 1 TO WS-VAR-0136
           ADD 1 TO WS-VAR-0137
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           CONTINUE.
       0046-PROCESS.
           ADD 1 TO WS-VAR-0138
           ADD 1 TO WS-VAR-0139
           ADD 1 TO WS-VAR-0140
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           CONTINUE.
       0047-PROCESS.
           ADD 1 TO WS-VAR-0141
           ADD 1 TO WS-VAR-0142
           ADD 1 TO WS-VAR-0143
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           CONTINUE.
       0048-PROCESS.
           ADD 1 TO WS-VAR-0144
           ADD 1 TO WS-VAR-0145
           ADD 1 TO WS-VAR-0146
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           CONTINUE.
       0049-PROCESS.
           ADD 1 TO WS-VAR-0147
           ADD 1 TO WS-VAR-0148
           ADD 1 TO WS-VAR-0149
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           CONTINUE.
       0050-PROCESS.
           ADD 1 TO WS-VAR-0150
           ADD 1 TO WS-VAR-0151
           ADD 1 TO WS-VAR-0152
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           CONTINUE.
       0051-PROCESS.
           ADD 1 TO WS-VAR-0153
           ADD 1 TO WS-VAR-0154
           ADD 1 TO WS-VAR-0155
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           CONTINUE.
       0052-PROCESS.
           ADD 1 TO WS-VAR-0156
           ADD 1 TO WS-VAR-0157
           ADD 1 TO WS-VAR-0158
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           CONTINUE.
       0053-PROCESS.
           ADD 1 TO WS-VAR-0159
           ADD 1 TO WS-VAR-0160
           ADD 1 TO WS-VAR-0161
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           CONTINUE.
       0054-PROCESS.
           ADD 1 TO WS-VAR-0162
           ADD 1 TO WS-VAR-0163
           ADD 1 TO WS-VAR-0164
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           CONTINUE.
       0055-PROCESS.
           ADD 1 TO WS-VAR-0165
           ADD 1 TO WS-VAR-0166
           ADD 1 TO WS-VAR-0167
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           CONTINUE.
       0056-PROCESS.
           ADD 1 TO WS-VAR-0168
           ADD 1 TO WS-VAR-0169
           ADD 1 TO WS-VAR-0170
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           CONTINUE.
       0057-PROCESS.
           ADD 1 TO WS-VAR-0171
           ADD 1 TO WS-VAR-0172
           ADD 1 TO WS-VAR-0173
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           CONTINUE.
       0058-PROCESS.
           ADD 1 TO WS-VAR-0174
           ADD 1 TO WS-VAR-0175
           ADD 1 TO WS-VAR-0176
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           CONTINUE.
       0059-PROCESS.
           ADD 1 TO WS-VAR-0177
           ADD 1 TO WS-VAR-0178
           ADD 1 TO WS-VAR-0179
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           CONTINUE.
       0060-PROCESS.
           ADD 1 TO WS-VAR-0180
           ADD 1 TO WS-VAR-0181
           ADD 1 TO WS-VAR-0182
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           CONTINUE.
       0061-PROCESS.
           ADD 1 TO WS-VAR-0183
           ADD 1 TO WS-VAR-0184
           ADD 1 TO WS-VAR-0185
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           CONTINUE.
       0062-PROCESS.
           ADD 1 TO WS-VAR-0186
           ADD 1 TO WS-VAR-0187
           ADD 1 TO WS-VAR-0188
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           CONTINUE.
       0063-PROCESS.
           ADD 1 TO WS-VAR-0189
           ADD 1 TO WS-VAR-0190
           ADD 1 TO WS-VAR-0191
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           CONTINUE.
       0064-PROCESS.
           ADD 1 TO WS-VAR-0192
           ADD 1 TO WS-VAR-0193
           ADD 1 TO WS-VAR-0194
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           CONTINUE.
       0065-PROCESS.
           ADD 1 TO WS-VAR-0195
           ADD 1 TO WS-VAR-0196
           ADD 1 TO WS-VAR-0197
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           CONTINUE.
       0066-PROCESS.
           ADD 1 TO WS-VAR-0198
           ADD 1 TO WS-VAR-0199
           ADD 1 TO WS-VAR-0200
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           CONTINUE.
       0067-PROCESS.
           ADD 1 TO WS-VAR-0201
           ADD 1 TO WS-VAR-0202
           ADD 1 TO WS-VAR-0203
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           CONTINUE.
       0068-PROCESS.
           ADD 1 TO WS-VAR-0204
           ADD 1 TO WS-VAR-0205
           ADD 1 TO WS-VAR-0206
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           CONTINUE.
       0069-PROCESS.
           ADD 1 TO WS-VAR-0207
           ADD 1 TO WS-VAR-0208
           ADD 1 TO WS-VAR-0209
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           CONTINUE.
       0070-PROCESS.
           ADD 1 TO WS-VAR-0210
           ADD 1 TO WS-VAR-0211
           ADD 1 TO WS-VAR-0212
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           CONTINUE.
       0071-PROCESS.
           ADD 1 TO WS-VAR-0213
           ADD 1 TO WS-VAR-0214
           ADD 1 TO WS-VAR-0215
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           CONTINUE.
       0072-PROCESS.
           ADD 1 TO WS-VAR-0216
           ADD 1 TO WS-VAR-0217
           ADD 1 TO WS-VAR-0218
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           CONTINUE.
       0073-PROCESS.
           ADD 1 TO WS-VAR-0219
           ADD 1 TO WS-VAR-0220
           ADD 1 TO WS-VAR-0221
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           CONTINUE.
       0074-PROCESS.
           ADD 1 TO WS-VAR-0222
           ADD 1 TO WS-VAR-0223
           ADD 1 TO WS-VAR-0224
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           CONTINUE.
       0075-PROCESS.
           ADD 1 TO WS-VAR-0225
           ADD 1 TO WS-VAR-0226
           ADD 1 TO WS-VAR-0227
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           CONTINUE.
       0076-PROCESS.
           ADD 1 TO WS-VAR-0228
           ADD 1 TO WS-VAR-0229
           ADD 1 TO WS-VAR-0230
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           CONTINUE.
       0077-PROCESS.
           ADD 1 TO WS-VAR-0231
           ADD 1 TO WS-VAR-0232
           ADD 1 TO WS-VAR-0233
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           CONTINUE.
       0078-PROCESS.
           ADD 1 TO WS-VAR-0234
           ADD 1 TO WS-VAR-0235
           ADD 1 TO WS-VAR-0236
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           CONTINUE.
       0079-PROCESS.
           ADD 1 TO WS-VAR-0237
           ADD 1 TO WS-VAR-0238
           ADD 1 TO WS-VAR-0239
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           CONTINUE.
       0080-PROCESS.
           ADD 1 TO WS-VAR-0240
           ADD 1 TO WS-VAR-0241
           ADD 1 TO WS-VAR-0242
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           CONTINUE.
       0081-PROCESS.
           ADD 1 TO WS-VAR-0243
           ADD 1 TO WS-VAR-0244
           ADD 1 TO WS-VAR-0245
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           CONTINUE.
       0082-PROCESS.
           ADD 1 TO WS-VAR-0246
           ADD 1 TO WS-VAR-0247
           ADD 1 TO WS-VAR-0248
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           CONTINUE.
       0083-PROCESS.
           ADD 1 TO WS-VAR-0249
           ADD 1 TO WS-VAR-0250
           ADD 1 TO WS-VAR-0251
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           CONTINUE.
       0084-PROCESS.
           ADD 1 TO WS-VAR-0252
           ADD 1 TO WS-VAR-0253
           ADD 1 TO WS-VAR-0254
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           CONTINUE.
       0085-PROCESS.
           ADD 1 TO WS-VAR-0255
           ADD 1 TO WS-VAR-0256
           ADD 1 TO WS-VAR-0257
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           ADD 1 TO WS-VAR-0270
           ADD 1 TO WS-VAR-0271
           ADD 1 TO WS-VAR-0272
           CONTINUE.
       0086-PROCESS.
           ADD 1 TO WS-VAR-0258
           ADD 1 TO WS-VAR-0259
           ADD 1 TO WS-VAR-0260
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           ADD 1 TO WS-VAR-0270
           ADD 1 TO WS-VAR-0271
           ADD 1 TO WS-VAR-0272
           ADD 1 TO WS-VAR-0273
           ADD 1 TO WS-VAR-0274
           ADD 1 TO WS-VAR-0275
           CONTINUE.
       0087-PROCESS.
           ADD 1 TO WS-VAR-0261
           ADD 1 TO WS-VAR-0262
           ADD 1 TO WS-VAR-0263
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           ADD 1 TO WS-VAR-0270
           ADD 1 TO WS-VAR-0271
           ADD 1 TO WS-VAR-0272
           ADD 1 TO WS-VAR-0273
           ADD 1 TO WS-VAR-0274
           ADD 1 TO WS-VAR-0275
           ADD 1 TO WS-VAR-0276
           ADD 1 TO WS-VAR-0277
           ADD 1 TO WS-VAR-0278
           CONTINUE.
       0088-PROCESS.
           ADD 1 TO WS-VAR-0264
           ADD 1 TO WS-VAR-0265
           ADD 1 TO WS-VAR-0266
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           ADD 1 TO WS-VAR-0270
           ADD 1 TO WS-VAR-0271
           ADD 1 TO WS-VAR-0272
           ADD 1 TO WS-VAR-0273
           ADD 1 TO WS-VAR-0274
           ADD 1 TO WS-VAR-0275
           ADD 1 TO WS-VAR-0276
           ADD 1 TO WS-VAR-0277
           ADD 1 TO WS-VAR-0278
           ADD 1 TO WS-VAR-0279
           ADD 1 TO WS-VAR-0280
           ADD 1 TO WS-VAR-0281
           CONTINUE.
       0089-PROCESS.
           ADD 1 TO WS-VAR-0267
           ADD 1 TO WS-VAR-0268
           ADD 1 TO WS-VAR-0269
           ADD 1 TO WS-VAR-0270
           ADD 1 TO WS-VAR-0271
           ADD 1 TO WS-VAR-0272
           ADD 1 TO WS-VAR-0273
           ADD 1 TO WS-VAR-0274
           ADD 1 TO WS-VAR-0275
           ADD 1 TO WS-VAR-0276
           ADD 1 TO WS-VAR-0277
           ADD 1 TO WS-VAR-0278
           ADD 1 TO WS-VAR-0279
           ADD 1 TO WS-VAR-0280
           ADD 1 TO WS-VAR-0281
           ADD 1 TO WS-VAR-0282
           ADD 1 TO WS-VAR-0283
           ADD 1 TO WS-VAR-0284
           CONTINUE.
       STOP RUN.
