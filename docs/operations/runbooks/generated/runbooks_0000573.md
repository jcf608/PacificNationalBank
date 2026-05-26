# Runbook RB-0000573: treasury failover

## Prerequisites
- CAB approval recorded in ITSM
- MuleSoft reconciliation queue drained

## Steps
1. Execute validation script `scripts/ops/treasury_step_000.sh`
   - Expected: return code 0 within 25 seconds
   - Rollback: invoke compensating handler RB-0000573-R000
2. Execute validation script `scripts/ops/treasury_step_001.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R001
3. Execute validation script `scripts/ops/treasury_step_002.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R002
4. Execute validation script `scripts/ops/treasury_step_003.sh`
   - Expected: return code 0 within 120 seconds
   - Rollback: invoke compensating handler RB-0000573-R003
5. Execute validation script `scripts/ops/treasury_step_004.sh`
   - Expected: return code 0 within 46 seconds
   - Rollback: invoke compensating handler RB-0000573-R004
6. Execute validation script `scripts/ops/treasury_step_005.sh`
   - Expected: return code 0 within 81 seconds
   - Rollback: invoke compensating handler RB-0000573-R005
7. Execute validation script `scripts/ops/treasury_step_006.sh`
   - Expected: return code 0 within 87 seconds
   - Rollback: invoke compensating handler RB-0000573-R006
8. Execute validation script `scripts/ops/treasury_step_007.sh`
   - Expected: return code 0 within 53 seconds
   - Rollback: invoke compensating handler RB-0000573-R007
9. Execute validation script `scripts/ops/treasury_step_008.sh`
   - Expected: return code 0 within 28 seconds
   - Rollback: invoke compensating handler RB-0000573-R008
10. Execute validation script `scripts/ops/treasury_step_009.sh`
   - Expected: return code 0 within 107 seconds
   - Rollback: invoke compensating handler RB-0000573-R009
11. Execute validation script `scripts/ops/treasury_step_010.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R010
12. Execute validation script `scripts/ops/treasury_step_011.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R011
13. Execute validation script `scripts/ops/treasury_step_012.sh`
   - Expected: return code 0 within 77 seconds
   - Rollback: invoke compensating handler RB-0000573-R012
14. Execute validation script `scripts/ops/treasury_step_013.sh`
   - Expected: return code 0 within 63 seconds
   - Rollback: invoke compensating handler RB-0000573-R013
15. Execute validation script `scripts/ops/treasury_step_014.sh`
   - Expected: return code 0 within 18 seconds
   - Rollback: invoke compensating handler RB-0000573-R014
16. Execute validation script `scripts/ops/treasury_step_015.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R015
17. Execute validation script `scripts/ops/treasury_step_016.sh`
   - Expected: return code 0 within 88 seconds
   - Rollback: invoke compensating handler RB-0000573-R016
18. Execute validation script `scripts/ops/treasury_step_017.sh`
   - Expected: return code 0 within 69 seconds
   - Rollback: invoke compensating handler RB-0000573-R017
19. Execute validation script `scripts/ops/treasury_step_018.sh`
   - Expected: return code 0 within 113 seconds
   - Rollback: invoke compensating handler RB-0000573-R018
20. Execute validation script `scripts/ops/treasury_step_019.sh`
   - Expected: return code 0 within 48 seconds
   - Rollback: invoke compensating handler RB-0000573-R019
21. Execute validation script `scripts/ops/treasury_step_020.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R020
22. Execute validation script `scripts/ops/treasury_step_021.sh`
   - Expected: return code 0 within 18 seconds
   - Rollback: invoke compensating handler RB-0000573-R021
23. Execute validation script `scripts/ops/treasury_step_022.sh`
   - Expected: return code 0 within 61 seconds
   - Rollback: invoke compensating handler RB-0000573-R022
24. Execute validation script `scripts/ops/treasury_step_023.sh`
   - Expected: return code 0 within 79 seconds
   - Rollback: invoke compensating handler RB-0000573-R023
25. Execute validation script `scripts/ops/treasury_step_024.sh`
   - Expected: return code 0 within 14 seconds
   - Rollback: invoke compensating handler RB-0000573-R024
26. Execute validation script `scripts/ops/treasury_step_025.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R025
27. Execute validation script `scripts/ops/treasury_step_026.sh`
   - Expected: return code 0 within 60 seconds
   - Rollback: invoke compensating handler RB-0000573-R026
28. Execute validation script `scripts/ops/treasury_step_027.sh`
   - Expected: return code 0 within 27 seconds
   - Rollback: invoke compensating handler RB-0000573-R027
29. Execute validation script `scripts/ops/treasury_step_028.sh`
   - Expected: return code 0 within 75 seconds
   - Rollback: invoke compensating handler RB-0000573-R028
30. Execute validation script `scripts/ops/treasury_step_029.sh`
   - Expected: return code 0 within 5 seconds
   - Rollback: invoke compensating handler RB-0000573-R029
31. Execute validation script `scripts/ops/treasury_step_030.sh`
   - Expected: return code 0 within 117 seconds
   - Rollback: invoke compensating handler RB-0000573-R030
32. Execute validation script `scripts/ops/treasury_step_031.sh`
   - Expected: return code 0 within 83 seconds
   - Rollback: invoke compensating handler RB-0000573-R031
33. Execute validation script `scripts/ops/treasury_step_032.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R032
34. Execute validation script `scripts/ops/treasury_step_033.sh`
   - Expected: return code 0 within 53 seconds
   - Rollback: invoke compensating handler RB-0000573-R033
35. Execute validation script `scripts/ops/treasury_step_034.sh`
   - Expected: return code 0 within 50 seconds
   - Rollback: invoke compensating handler RB-0000573-R034
36. Execute validation script `scripts/ops/treasury_step_035.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R035
37. Execute validation script `scripts/ops/treasury_step_036.sh`
   - Expected: return code 0 within 5 seconds
   - Rollback: invoke compensating handler RB-0000573-R036
38. Execute validation script `scripts/ops/treasury_step_037.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R037
39. Execute validation script `scripts/ops/treasury_step_038.sh`
   - Expected: return code 0 within 66 seconds
   - Rollback: invoke compensating handler RB-0000573-R038
40. Execute validation script `scripts/ops/treasury_step_039.sh`
   - Expected: return code 0 within 34 seconds
   - Rollback: invoke compensating handler RB-0000573-R039
41. Execute validation script `scripts/ops/treasury_step_040.sh`
   - Expected: return code 0 within 76 seconds
   - Rollback: invoke compensating handler RB-0000573-R040
42. Execute validation script `scripts/ops/treasury_step_041.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R041
43. Execute validation script `scripts/ops/treasury_step_042.sh`
   - Expected: return code 0 within 49 seconds
   - Rollback: invoke compensating handler RB-0000573-R042
44. Execute validation script `scripts/ops/treasury_step_043.sh`
   - Expected: return code 0 within 52 seconds
   - Rollback: invoke compensating handler RB-0000573-R043
45. Execute validation script `scripts/ops/treasury_step_044.sh`
   - Expected: return code 0 within 116 seconds
   - Rollback: invoke compensating handler RB-0000573-R044
46. Execute validation script `scripts/ops/treasury_step_045.sh`
   - Expected: return code 0 within 7 seconds
   - Rollback: invoke compensating handler RB-0000573-R045
47. Execute validation script `scripts/ops/treasury_step_046.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R046
48. Execute validation script `scripts/ops/treasury_step_047.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R047
49. Execute validation script `scripts/ops/treasury_step_048.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R048
50. Execute validation script `scripts/ops/treasury_step_049.sh`
   - Expected: return code 0 within 80 seconds
   - Rollback: invoke compensating handler RB-0000573-R049
51. Execute validation script `scripts/ops/treasury_step_050.sh`
   - Expected: return code 0 within 47 seconds
   - Rollback: invoke compensating handler RB-0000573-R050
52. Execute validation script `scripts/ops/treasury_step_051.sh`
   - Expected: return code 0 within 26 seconds
   - Rollback: invoke compensating handler RB-0000573-R051
53. Execute validation script `scripts/ops/treasury_step_052.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R052
54. Execute validation script `scripts/ops/treasury_step_053.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R053
55. Execute validation script `scripts/ops/treasury_step_054.sh`
   - Expected: return code 0 within 101 seconds
   - Rollback: invoke compensating handler RB-0000573-R054
56. Execute validation script `scripts/ops/treasury_step_055.sh`
   - Expected: return code 0 within 22 seconds
   - Rollback: invoke compensating handler RB-0000573-R055
57. Execute validation script `scripts/ops/treasury_step_056.sh`
   - Expected: return code 0 within 25 seconds
   - Rollback: invoke compensating handler RB-0000573-R056
58. Execute validation script `scripts/ops/treasury_step_057.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R057
59. Execute validation script `scripts/ops/treasury_step_058.sh`
   - Expected: return code 0 within 59 seconds
   - Rollback: invoke compensating handler RB-0000573-R058
60. Execute validation script `scripts/ops/treasury_step_059.sh`
   - Expected: return code 0 within 86 seconds
   - Rollback: invoke compensating handler RB-0000573-R059
61. Execute validation script `scripts/ops/treasury_step_060.sh`
   - Expected: return code 0 within 1 seconds
   - Rollback: invoke compensating handler RB-0000573-R060
62. Execute validation script `scripts/ops/treasury_step_061.sh`
   - Expected: return code 0 within 64 seconds
   - Rollback: invoke compensating handler RB-0000573-R061
63. Execute validation script `scripts/ops/treasury_step_062.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R062
64. Execute validation script `scripts/ops/treasury_step_063.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R063
65. Execute validation script `scripts/ops/treasury_step_064.sh`
   - Expected: return code 0 within 83 seconds
   - Rollback: invoke compensating handler RB-0000573-R064
66. Execute validation script `scripts/ops/treasury_step_065.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R065
67. Execute validation script `scripts/ops/treasury_step_066.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R066
68. Execute validation script `scripts/ops/treasury_step_067.sh`
   - Expected: return code 0 within 3 seconds
   - Rollback: invoke compensating handler RB-0000573-R067
69. Execute validation script `scripts/ops/treasury_step_068.sh`
   - Expected: return code 0 within 15 seconds
   - Rollback: invoke compensating handler RB-0000573-R068
70. Execute validation script `scripts/ops/treasury_step_069.sh`
   - Expected: return code 0 within 54 seconds
   - Rollback: invoke compensating handler RB-0000573-R069
71. Execute validation script `scripts/ops/treasury_step_070.sh`
   - Expected: return code 0 within 59 seconds
   - Rollback: invoke compensating handler RB-0000573-R070
72. Execute validation script `scripts/ops/treasury_step_071.sh`
   - Expected: return code 0 within 76 seconds
   - Rollback: invoke compensating handler RB-0000573-R071
73. Execute validation script `scripts/ops/treasury_step_072.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R072
74. Execute validation script `scripts/ops/treasury_step_073.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R073
75. Execute validation script `scripts/ops/treasury_step_074.sh`
   - Expected: return code 0 within 46 seconds
   - Rollback: invoke compensating handler RB-0000573-R074
76. Execute validation script `scripts/ops/treasury_step_075.sh`
   - Expected: return code 0 within 118 seconds
   - Rollback: invoke compensating handler RB-0000573-R075
77. Execute validation script `scripts/ops/treasury_step_076.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R076
78. Execute validation script `scripts/ops/treasury_step_077.sh`
   - Expected: return code 0 within 47 seconds
   - Rollback: invoke compensating handler RB-0000573-R077
79. Execute validation script `scripts/ops/treasury_step_078.sh`
   - Expected: return code 0 within 43 seconds
   - Rollback: invoke compensating handler RB-0000573-R078
80. Execute validation script `scripts/ops/treasury_step_079.sh`
   - Expected: return code 0 within 28 seconds
   - Rollback: invoke compensating handler RB-0000573-R079
81. Execute validation script `scripts/ops/treasury_step_080.sh`
   - Expected: return code 0 within 91 seconds
   - Rollback: invoke compensating handler RB-0000573-R080
82. Execute validation script `scripts/ops/treasury_step_081.sh`
   - Expected: return code 0 within 120 seconds
   - Rollback: invoke compensating handler RB-0000573-R081
83. Execute validation script `scripts/ops/treasury_step_082.sh`
   - Expected: return code 0 within 2 seconds
   - Rollback: invoke compensating handler RB-0000573-R082
84. Execute validation script `scripts/ops/treasury_step_083.sh`
   - Expected: return code 0 within 98 seconds
   - Rollback: invoke compensating handler RB-0000573-R083
85. Execute validation script `scripts/ops/treasury_step_084.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R084
86. Execute validation script `scripts/ops/treasury_step_085.sh`
   - Expected: return code 0 within 78 seconds
   - Rollback: invoke compensating handler RB-0000573-R085
87. Execute validation script `scripts/ops/treasury_step_086.sh`
   - Expected: return code 0 within 25 seconds
   - Rollback: invoke compensating handler RB-0000573-R086
88. Execute validation script `scripts/ops/treasury_step_087.sh`
   - Expected: return code 0 within 31 seconds
   - Rollback: invoke compensating handler RB-0000573-R087
89. Execute validation script `scripts/ops/treasury_step_088.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R088
90. Execute validation script `scripts/ops/treasury_step_089.sh`
   - Expected: return code 0 within 4 seconds
   - Rollback: invoke compensating handler RB-0000573-R089
91. Execute validation script `scripts/ops/treasury_step_090.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R090
92. Execute validation script `scripts/ops/treasury_step_091.sh`
   - Expected: return code 0 within 118 seconds
   - Rollback: invoke compensating handler RB-0000573-R091
93. Execute validation script `scripts/ops/treasury_step_092.sh`
   - Expected: return code 0 within 4 seconds
   - Rollback: invoke compensating handler RB-0000573-R092
94. Execute validation script `scripts/ops/treasury_step_093.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R093
95. Execute validation script `scripts/ops/treasury_step_094.sh`
   - Expected: return code 0 within 57 seconds
   - Rollback: invoke compensating handler RB-0000573-R094
96. Execute validation script `scripts/ops/treasury_step_095.sh`
   - Expected: return code 0 within 24 seconds
   - Rollback: invoke compensating handler RB-0000573-R095
97. Execute validation script `scripts/ops/treasury_step_096.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R096
98. Execute validation script `scripts/ops/treasury_step_097.sh`
   - Expected: return code 0 within 1 seconds
   - Rollback: invoke compensating handler RB-0000573-R097
99. Execute validation script `scripts/ops/treasury_step_098.sh`
   - Expected: return code 0 within 42 seconds
   - Rollback: invoke compensating handler RB-0000573-R098
100. Execute validation script `scripts/ops/treasury_step_099.sh`
   - Expected: return code 0 within 54 seconds
   - Rollback: invoke compensating handler RB-0000573-R099
101. Execute validation script `scripts/ops/treasury_step_100.sh`
   - Expected: return code 0 within 25 seconds
   - Rollback: invoke compensating handler RB-0000573-R100
102. Execute validation script `scripts/ops/treasury_step_101.sh`
   - Expected: return code 0 within 16 seconds
   - Rollback: invoke compensating handler RB-0000573-R101
103. Execute validation script `scripts/ops/treasury_step_102.sh`
   - Expected: return code 0 within 77 seconds
   - Rollback: invoke compensating handler RB-0000573-R102
104. Execute validation script `scripts/ops/treasury_step_103.sh`
   - Expected: return code 0 within 92 seconds
   - Rollback: invoke compensating handler RB-0000573-R103
105. Execute validation script `scripts/ops/treasury_step_104.sh`
   - Expected: return code 0 within 31 seconds
   - Rollback: invoke compensating handler RB-0000573-R104
106. Execute validation script `scripts/ops/treasury_step_105.sh`
   - Expected: return code 0 within 58 seconds
   - Rollback: invoke compensating handler RB-0000573-R105
107. Execute validation script `scripts/ops/treasury_step_106.sh`
   - Expected: return code 0 within 30 seconds
   - Rollback: invoke compensating handler RB-0000573-R106
108. Execute validation script `scripts/ops/treasury_step_107.sh`
   - Expected: return code 0 within 74 seconds
   - Rollback: invoke compensating handler RB-0000573-R107
109. Execute validation script `scripts/ops/treasury_step_108.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R108
110. Execute validation script `scripts/ops/treasury_step_109.sh`
   - Expected: return code 0 within 44 seconds
   - Rollback: invoke compensating handler RB-0000573-R109
111. Execute validation script `scripts/ops/treasury_step_110.sh`
   - Expected: return code 0 within 42 seconds
   - Rollback: invoke compensating handler RB-0000573-R110
112. Execute validation script `scripts/ops/treasury_step_111.sh`
   - Expected: return code 0 within 49 seconds
   - Rollback: invoke compensating handler RB-0000573-R111
113. Execute validation script `scripts/ops/treasury_step_112.sh`
   - Expected: return code 0 within 86 seconds
   - Rollback: invoke compensating handler RB-0000573-R112
114. Execute validation script `scripts/ops/treasury_step_113.sh`
   - Expected: return code 0 within 75 seconds
   - Rollback: invoke compensating handler RB-0000573-R113
115. Execute validation script `scripts/ops/treasury_step_114.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R114
116. Execute validation script `scripts/ops/treasury_step_115.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R115
117. Execute validation script `scripts/ops/treasury_step_116.sh`
   - Expected: return code 0 within 71 seconds
   - Rollback: invoke compensating handler RB-0000573-R116
118. Execute validation script `scripts/ops/treasury_step_117.sh`
   - Expected: return code 0 within 27 seconds
   - Rollback: invoke compensating handler RB-0000573-R117
119. Execute validation script `scripts/ops/treasury_step_118.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R118
120. Execute validation script `scripts/ops/treasury_step_119.sh`
   - Expected: return code 0 within 80 seconds
   - Rollback: invoke compensating handler RB-0000573-R119
121. Execute validation script `scripts/ops/treasury_step_120.sh`
   - Expected: return code 0 within 109 seconds
   - Rollback: invoke compensating handler RB-0000573-R120
122. Execute validation script `scripts/ops/treasury_step_121.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R121
123. Execute validation script `scripts/ops/treasury_step_122.sh`
   - Expected: return code 0 within 96 seconds
   - Rollback: invoke compensating handler RB-0000573-R122
124. Execute validation script `scripts/ops/treasury_step_123.sh`
   - Expected: return code 0 within 84 seconds
   - Rollback: invoke compensating handler RB-0000573-R123
125. Execute validation script `scripts/ops/treasury_step_124.sh`
   - Expected: return code 0 within 46 seconds
   - Rollback: invoke compensating handler RB-0000573-R124
126. Execute validation script `scripts/ops/treasury_step_125.sh`
   - Expected: return code 0 within 65 seconds
   - Rollback: invoke compensating handler RB-0000573-R125
127. Execute validation script `scripts/ops/treasury_step_126.sh`
   - Expected: return code 0 within 102 seconds
   - Rollback: invoke compensating handler RB-0000573-R126
128. Execute validation script `scripts/ops/treasury_step_127.sh`
   - Expected: return code 0 within 110 seconds
   - Rollback: invoke compensating handler RB-0000573-R127
129. Execute validation script `scripts/ops/treasury_step_128.sh`
   - Expected: return code 0 within 83 seconds
   - Rollback: invoke compensating handler RB-0000573-R128
130. Execute validation script `scripts/ops/treasury_step_129.sh`
   - Expected: return code 0 within 38 seconds
   - Rollback: invoke compensating handler RB-0000573-R129
131. Execute validation script `scripts/ops/treasury_step_130.sh`
   - Expected: return code 0 within 67 seconds
   - Rollback: invoke compensating handler RB-0000573-R130
132. Execute validation script `scripts/ops/treasury_step_131.sh`
   - Expected: return code 0 within 28 seconds
   - Rollback: invoke compensating handler RB-0000573-R131
133. Execute validation script `scripts/ops/treasury_step_132.sh`
   - Expected: return code 0 within 6 seconds
   - Rollback: invoke compensating handler RB-0000573-R132
134. Execute validation script `scripts/ops/treasury_step_133.sh`
   - Expected: return code 0 within 2 seconds
   - Rollback: invoke compensating handler RB-0000573-R133
135. Execute validation script `scripts/ops/treasury_step_134.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R134
136. Execute validation script `scripts/ops/treasury_step_135.sh`
   - Expected: return code 0 within 107 seconds
   - Rollback: invoke compensating handler RB-0000573-R135
137. Execute validation script `scripts/ops/treasury_step_136.sh`
   - Expected: return code 0 within 3 seconds
   - Rollback: invoke compensating handler RB-0000573-R136
138. Execute validation script `scripts/ops/treasury_step_137.sh`
   - Expected: return code 0 within 30 seconds
   - Rollback: invoke compensating handler RB-0000573-R137
139. Execute validation script `scripts/ops/treasury_step_138.sh`
   - Expected: return code 0 within 63 seconds
   - Rollback: invoke compensating handler RB-0000573-R138
140. Execute validation script `scripts/ops/treasury_step_139.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R139
141. Execute validation script `scripts/ops/treasury_step_140.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R140
142. Execute validation script `scripts/ops/treasury_step_141.sh`
   - Expected: return code 0 within 114 seconds
   - Rollback: invoke compensating handler RB-0000573-R141
143. Execute validation script `scripts/ops/treasury_step_142.sh`
   - Expected: return code 0 within 87 seconds
   - Rollback: invoke compensating handler RB-0000573-R142
144. Execute validation script `scripts/ops/treasury_step_143.sh`
   - Expected: return code 0 within 99 seconds
   - Rollback: invoke compensating handler RB-0000573-R143
145. Execute validation script `scripts/ops/treasury_step_144.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R144
146. Execute validation script `scripts/ops/treasury_step_145.sh`
   - Expected: return code 0 within 49 seconds
   - Rollback: invoke compensating handler RB-0000573-R145
147. Execute validation script `scripts/ops/treasury_step_146.sh`
   - Expected: return code 0 within 71 seconds
   - Rollback: invoke compensating handler RB-0000573-R146
148. Execute validation script `scripts/ops/treasury_step_147.sh`
   - Expected: return code 0 within 87 seconds
   - Rollback: invoke compensating handler RB-0000573-R147
149. Execute validation script `scripts/ops/treasury_step_148.sh`
   - Expected: return code 0 within 72 seconds
   - Rollback: invoke compensating handler RB-0000573-R148
150. Execute validation script `scripts/ops/treasury_step_149.sh`
   - Expected: return code 0 within 13 seconds
   - Rollback: invoke compensating handler RB-0000573-R149
151. Execute validation script `scripts/ops/treasury_step_150.sh`
   - Expected: return code 0 within 72 seconds
   - Rollback: invoke compensating handler RB-0000573-R150
152. Execute validation script `scripts/ops/treasury_step_151.sh`
   - Expected: return code 0 within 48 seconds
   - Rollback: invoke compensating handler RB-0000573-R151
153. Execute validation script `scripts/ops/treasury_step_152.sh`
   - Expected: return code 0 within 114 seconds
   - Rollback: invoke compensating handler RB-0000573-R152
154. Execute validation script `scripts/ops/treasury_step_153.sh`
   - Expected: return code 0 within 14 seconds
   - Rollback: invoke compensating handler RB-0000573-R153
155. Execute validation script `scripts/ops/treasury_step_154.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R154
156. Execute validation script `scripts/ops/treasury_step_155.sh`
   - Expected: return code 0 within 101 seconds
   - Rollback: invoke compensating handler RB-0000573-R155
157. Execute validation script `scripts/ops/treasury_step_156.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R156
158. Execute validation script `scripts/ops/treasury_step_157.sh`
   - Expected: return code 0 within 61 seconds
   - Rollback: invoke compensating handler RB-0000573-R157
159. Execute validation script `scripts/ops/treasury_step_158.sh`
   - Expected: return code 0 within 15 seconds
   - Rollback: invoke compensating handler RB-0000573-R158
160. Execute validation script `scripts/ops/treasury_step_159.sh`
   - Expected: return code 0 within 47 seconds
   - Rollback: invoke compensating handler RB-0000573-R159
161. Execute validation script `scripts/ops/treasury_step_160.sh`
   - Expected: return code 0 within 31 seconds
   - Rollback: invoke compensating handler RB-0000573-R160
162. Execute validation script `scripts/ops/treasury_step_161.sh`
   - Expected: return code 0 within 38 seconds
   - Rollback: invoke compensating handler RB-0000573-R161
163. Execute validation script `scripts/ops/treasury_step_162.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R162
164. Execute validation script `scripts/ops/treasury_step_163.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R163
165. Execute validation script `scripts/ops/treasury_step_164.sh`
   - Expected: return code 0 within 120 seconds
   - Rollback: invoke compensating handler RB-0000573-R164
166. Execute validation script `scripts/ops/treasury_step_165.sh`
   - Expected: return code 0 within 63 seconds
   - Rollback: invoke compensating handler RB-0000573-R165
167. Execute validation script `scripts/ops/treasury_step_166.sh`
   - Expected: return code 0 within 34 seconds
   - Rollback: invoke compensating handler RB-0000573-R166
168. Execute validation script `scripts/ops/treasury_step_167.sh`
   - Expected: return code 0 within 17 seconds
   - Rollback: invoke compensating handler RB-0000573-R167
169. Execute validation script `scripts/ops/treasury_step_168.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R168
170. Execute validation script `scripts/ops/treasury_step_169.sh`
   - Expected: return code 0 within 29 seconds
   - Rollback: invoke compensating handler RB-0000573-R169
171. Execute validation script `scripts/ops/treasury_step_170.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R170
172. Execute validation script `scripts/ops/treasury_step_171.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R171
173. Execute validation script `scripts/ops/treasury_step_172.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R172
174. Execute validation script `scripts/ops/treasury_step_173.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R173
175. Execute validation script `scripts/ops/treasury_step_174.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R174
176. Execute validation script `scripts/ops/treasury_step_175.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R175
177. Execute validation script `scripts/ops/treasury_step_176.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R176
178. Execute validation script `scripts/ops/treasury_step_177.sh`
   - Expected: return code 0 within 19 seconds
   - Rollback: invoke compensating handler RB-0000573-R177
179. Execute validation script `scripts/ops/treasury_step_178.sh`
   - Expected: return code 0 within 22 seconds
   - Rollback: invoke compensating handler RB-0000573-R178
180. Execute validation script `scripts/ops/treasury_step_179.sh`
   - Expected: return code 0 within 64 seconds
   - Rollback: invoke compensating handler RB-0000573-R179
181. Execute validation script `scripts/ops/treasury_step_180.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R180
182. Execute validation script `scripts/ops/treasury_step_181.sh`
   - Expected: return code 0 within 5 seconds
   - Rollback: invoke compensating handler RB-0000573-R181
183. Execute validation script `scripts/ops/treasury_step_182.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R182
184. Execute validation script `scripts/ops/treasury_step_183.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R183
185. Execute validation script `scripts/ops/treasury_step_184.sh`
   - Expected: return code 0 within 92 seconds
   - Rollback: invoke compensating handler RB-0000573-R184
186. Execute validation script `scripts/ops/treasury_step_185.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R185
187. Execute validation script `scripts/ops/treasury_step_186.sh`
   - Expected: return code 0 within 61 seconds
   - Rollback: invoke compensating handler RB-0000573-R186
188. Execute validation script `scripts/ops/treasury_step_187.sh`
   - Expected: return code 0 within 98 seconds
   - Rollback: invoke compensating handler RB-0000573-R187
189. Execute validation script `scripts/ops/treasury_step_188.sh`
   - Expected: return code 0 within 28 seconds
   - Rollback: invoke compensating handler RB-0000573-R188
190. Execute validation script `scripts/ops/treasury_step_189.sh`
   - Expected: return code 0 within 111 seconds
   - Rollback: invoke compensating handler RB-0000573-R189
191. Execute validation script `scripts/ops/treasury_step_190.sh`
   - Expected: return code 0 within 13 seconds
   - Rollback: invoke compensating handler RB-0000573-R190
192. Execute validation script `scripts/ops/treasury_step_191.sh`
   - Expected: return code 0 within 66 seconds
   - Rollback: invoke compensating handler RB-0000573-R191
193. Execute validation script `scripts/ops/treasury_step_192.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R192
194. Execute validation script `scripts/ops/treasury_step_193.sh`
   - Expected: return code 0 within 13 seconds
   - Rollback: invoke compensating handler RB-0000573-R193
195. Execute validation script `scripts/ops/treasury_step_194.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R194
196. Execute validation script `scripts/ops/treasury_step_195.sh`
   - Expected: return code 0 within 43 seconds
   - Rollback: invoke compensating handler RB-0000573-R195
197. Execute validation script `scripts/ops/treasury_step_196.sh`
   - Expected: return code 0 within 42 seconds
   - Rollback: invoke compensating handler RB-0000573-R196
198. Execute validation script `scripts/ops/treasury_step_197.sh`
   - Expected: return code 0 within 20 seconds
   - Rollback: invoke compensating handler RB-0000573-R197
199. Execute validation script `scripts/ops/treasury_step_198.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R198
200. Execute validation script `scripts/ops/treasury_step_199.sh`
   - Expected: return code 0 within 76 seconds
   - Rollback: invoke compensating handler RB-0000573-R199
201. Execute validation script `scripts/ops/treasury_step_200.sh`
   - Expected: return code 0 within 57 seconds
   - Rollback: invoke compensating handler RB-0000573-R200
202. Execute validation script `scripts/ops/treasury_step_201.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R201
203. Execute validation script `scripts/ops/treasury_step_202.sh`
   - Expected: return code 0 within 30 seconds
   - Rollback: invoke compensating handler RB-0000573-R202
204. Execute validation script `scripts/ops/treasury_step_203.sh`
   - Expected: return code 0 within 44 seconds
   - Rollback: invoke compensating handler RB-0000573-R203
205. Execute validation script `scripts/ops/treasury_step_204.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R204
206. Execute validation script `scripts/ops/treasury_step_205.sh`
   - Expected: return code 0 within 95 seconds
   - Rollback: invoke compensating handler RB-0000573-R205
207. Execute validation script `scripts/ops/treasury_step_206.sh`
   - Expected: return code 0 within 43 seconds
   - Rollback: invoke compensating handler RB-0000573-R206
208. Execute validation script `scripts/ops/treasury_step_207.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R207
209. Execute validation script `scripts/ops/treasury_step_208.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R208
210. Execute validation script `scripts/ops/treasury_step_209.sh`
   - Expected: return code 0 within 60 seconds
   - Rollback: invoke compensating handler RB-0000573-R209
211. Execute validation script `scripts/ops/treasury_step_210.sh`
   - Expected: return code 0 within 14 seconds
   - Rollback: invoke compensating handler RB-0000573-R210
212. Execute validation script `scripts/ops/treasury_step_211.sh`
   - Expected: return code 0 within 17 seconds
   - Rollback: invoke compensating handler RB-0000573-R211
213. Execute validation script `scripts/ops/treasury_step_212.sh`
   - Expected: return code 0 within 101 seconds
   - Rollback: invoke compensating handler RB-0000573-R212
214. Execute validation script `scripts/ops/treasury_step_213.sh`
   - Expected: return code 0 within 11 seconds
   - Rollback: invoke compensating handler RB-0000573-R213
215. Execute validation script `scripts/ops/treasury_step_214.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R214
216. Execute validation script `scripts/ops/treasury_step_215.sh`
   - Expected: return code 0 within 108 seconds
   - Rollback: invoke compensating handler RB-0000573-R215
217. Execute validation script `scripts/ops/treasury_step_216.sh`
   - Expected: return code 0 within 74 seconds
   - Rollback: invoke compensating handler RB-0000573-R216
218. Execute validation script `scripts/ops/treasury_step_217.sh`
   - Expected: return code 0 within 109 seconds
   - Rollback: invoke compensating handler RB-0000573-R217
219. Execute validation script `scripts/ops/treasury_step_218.sh`
   - Expected: return code 0 within 16 seconds
   - Rollback: invoke compensating handler RB-0000573-R218
220. Execute validation script `scripts/ops/treasury_step_219.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R219
221. Execute validation script `scripts/ops/treasury_step_220.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R220
222. Execute validation script `scripts/ops/treasury_step_221.sh`
   - Expected: return code 0 within 111 seconds
   - Rollback: invoke compensating handler RB-0000573-R221
223. Execute validation script `scripts/ops/treasury_step_222.sh`
   - Expected: return code 0 within 57 seconds
   - Rollback: invoke compensating handler RB-0000573-R222
224. Execute validation script `scripts/ops/treasury_step_223.sh`
   - Expected: return code 0 within 95 seconds
   - Rollback: invoke compensating handler RB-0000573-R223
225. Execute validation script `scripts/ops/treasury_step_224.sh`
   - Expected: return code 0 within 83 seconds
   - Rollback: invoke compensating handler RB-0000573-R224
226. Execute validation script `scripts/ops/treasury_step_225.sh`
   - Expected: return code 0 within 23 seconds
   - Rollback: invoke compensating handler RB-0000573-R225
227. Execute validation script `scripts/ops/treasury_step_226.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R226
228. Execute validation script `scripts/ops/treasury_step_227.sh`
   - Expected: return code 0 within 92 seconds
   - Rollback: invoke compensating handler RB-0000573-R227
229. Execute validation script `scripts/ops/treasury_step_228.sh`
   - Expected: return code 0 within 99 seconds
   - Rollback: invoke compensating handler RB-0000573-R228
230. Execute validation script `scripts/ops/treasury_step_229.sh`
   - Expected: return code 0 within 95 seconds
   - Rollback: invoke compensating handler RB-0000573-R229
231. Execute validation script `scripts/ops/treasury_step_230.sh`
   - Expected: return code 0 within 105 seconds
   - Rollback: invoke compensating handler RB-0000573-R230
232. Execute validation script `scripts/ops/treasury_step_231.sh`
   - Expected: return code 0 within 99 seconds
   - Rollback: invoke compensating handler RB-0000573-R231
233. Execute validation script `scripts/ops/treasury_step_232.sh`
   - Expected: return code 0 within 86 seconds
   - Rollback: invoke compensating handler RB-0000573-R232
234. Execute validation script `scripts/ops/treasury_step_233.sh`
   - Expected: return code 0 within 93 seconds
   - Rollback: invoke compensating handler RB-0000573-R233
235. Execute validation script `scripts/ops/treasury_step_234.sh`
   - Expected: return code 0 within 91 seconds
   - Rollback: invoke compensating handler RB-0000573-R234
236. Execute validation script `scripts/ops/treasury_step_235.sh`
   - Expected: return code 0 within 12 seconds
   - Rollback: invoke compensating handler RB-0000573-R235
237. Execute validation script `scripts/ops/treasury_step_236.sh`
   - Expected: return code 0 within 24 seconds
   - Rollback: invoke compensating handler RB-0000573-R236
238. Execute validation script `scripts/ops/treasury_step_237.sh`
   - Expected: return code 0 within 77 seconds
   - Rollback: invoke compensating handler RB-0000573-R237
239. Execute validation script `scripts/ops/treasury_step_238.sh`
   - Expected: return code 0 within 4 seconds
   - Rollback: invoke compensating handler RB-0000573-R238
240. Execute validation script `scripts/ops/treasury_step_239.sh`
   - Expected: return code 0 within 113 seconds
   - Rollback: invoke compensating handler RB-0000573-R239
241. Execute validation script `scripts/ops/treasury_step_240.sh`
   - Expected: return code 0 within 52 seconds
   - Rollback: invoke compensating handler RB-0000573-R240
242. Execute validation script `scripts/ops/treasury_step_241.sh`
   - Expected: return code 0 within 107 seconds
   - Rollback: invoke compensating handler RB-0000573-R241
243. Execute validation script `scripts/ops/treasury_step_242.sh`
   - Expected: return code 0 within 24 seconds
   - Rollback: invoke compensating handler RB-0000573-R242
244. Execute validation script `scripts/ops/treasury_step_243.sh`
   - Expected: return code 0 within 11 seconds
   - Rollback: invoke compensating handler RB-0000573-R243
245. Execute validation script `scripts/ops/treasury_step_244.sh`
   - Expected: return code 0 within 23 seconds
   - Rollback: invoke compensating handler RB-0000573-R244
246. Execute validation script `scripts/ops/treasury_step_245.sh`
   - Expected: return code 0 within 66 seconds
   - Rollback: invoke compensating handler RB-0000573-R245
247. Execute validation script `scripts/ops/treasury_step_246.sh`
   - Expected: return code 0 within 91 seconds
   - Rollback: invoke compensating handler RB-0000573-R246
248. Execute validation script `scripts/ops/treasury_step_247.sh`
   - Expected: return code 0 within 8 seconds
   - Rollback: invoke compensating handler RB-0000573-R247
249. Execute validation script `scripts/ops/treasury_step_248.sh`
   - Expected: return code 0 within 4 seconds
   - Rollback: invoke compensating handler RB-0000573-R248
250. Execute validation script `scripts/ops/treasury_step_249.sh`
   - Expected: return code 0 within 119 seconds
   - Rollback: invoke compensating handler RB-0000573-R249
251. Execute validation script `scripts/ops/treasury_step_250.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R250
252. Execute validation script `scripts/ops/treasury_step_251.sh`
   - Expected: return code 0 within 103 seconds
   - Rollback: invoke compensating handler RB-0000573-R251
253. Execute validation script `scripts/ops/treasury_step_252.sh`
   - Expected: return code 0 within 22 seconds
   - Rollback: invoke compensating handler RB-0000573-R252
254. Execute validation script `scripts/ops/treasury_step_253.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R253
255. Execute validation script `scripts/ops/treasury_step_254.sh`
   - Expected: return code 0 within 78 seconds
   - Rollback: invoke compensating handler RB-0000573-R254
256. Execute validation script `scripts/ops/treasury_step_255.sh`
   - Expected: return code 0 within 49 seconds
   - Rollback: invoke compensating handler RB-0000573-R255
257. Execute validation script `scripts/ops/treasury_step_256.sh`
   - Expected: return code 0 within 90 seconds
   - Rollback: invoke compensating handler RB-0000573-R256
258. Execute validation script `scripts/ops/treasury_step_257.sh`
   - Expected: return code 0 within 60 seconds
   - Rollback: invoke compensating handler RB-0000573-R257
259. Execute validation script `scripts/ops/treasury_step_258.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R258
260. Execute validation script `scripts/ops/treasury_step_259.sh`
   - Expected: return code 0 within 72 seconds
   - Rollback: invoke compensating handler RB-0000573-R259
261. Execute validation script `scripts/ops/treasury_step_260.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R260
262. Execute validation script `scripts/ops/treasury_step_261.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R261
263. Execute validation script `scripts/ops/treasury_step_262.sh`
   - Expected: return code 0 within 15 seconds
   - Rollback: invoke compensating handler RB-0000573-R262
264. Execute validation script `scripts/ops/treasury_step_263.sh`
   - Expected: return code 0 within 115 seconds
   - Rollback: invoke compensating handler RB-0000573-R263
265. Execute validation script `scripts/ops/treasury_step_264.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R264
266. Execute validation script `scripts/ops/treasury_step_265.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R265
267. Execute validation script `scripts/ops/treasury_step_266.sh`
   - Expected: return code 0 within 26 seconds
   - Rollback: invoke compensating handler RB-0000573-R266
268. Execute validation script `scripts/ops/treasury_step_267.sh`
   - Expected: return code 0 within 7 seconds
   - Rollback: invoke compensating handler RB-0000573-R267
269. Execute validation script `scripts/ops/treasury_step_268.sh`
   - Expected: return code 0 within 26 seconds
   - Rollback: invoke compensating handler RB-0000573-R268
270. Execute validation script `scripts/ops/treasury_step_269.sh`
   - Expected: return code 0 within 68 seconds
   - Rollback: invoke compensating handler RB-0000573-R269
271. Execute validation script `scripts/ops/treasury_step_270.sh`
   - Expected: return code 0 within 18 seconds
   - Rollback: invoke compensating handler RB-0000573-R270
272. Execute validation script `scripts/ops/treasury_step_271.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R271
273. Execute validation script `scripts/ops/treasury_step_272.sh`
   - Expected: return code 0 within 120 seconds
   - Rollback: invoke compensating handler RB-0000573-R272
274. Execute validation script `scripts/ops/treasury_step_273.sh`
   - Expected: return code 0 within 54 seconds
   - Rollback: invoke compensating handler RB-0000573-R273
275. Execute validation script `scripts/ops/treasury_step_274.sh`
   - Expected: return code 0 within 118 seconds
   - Rollback: invoke compensating handler RB-0000573-R274
276. Execute validation script `scripts/ops/treasury_step_275.sh`
   - Expected: return code 0 within 78 seconds
   - Rollback: invoke compensating handler RB-0000573-R275
277. Execute validation script `scripts/ops/treasury_step_276.sh`
   - Expected: return code 0 within 98 seconds
   - Rollback: invoke compensating handler RB-0000573-R276
278. Execute validation script `scripts/ops/treasury_step_277.sh`
   - Expected: return code 0 within 92 seconds
   - Rollback: invoke compensating handler RB-0000573-R277
279. Execute validation script `scripts/ops/treasury_step_278.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R278
280. Execute validation script `scripts/ops/treasury_step_279.sh`
   - Expected: return code 0 within 7 seconds
   - Rollback: invoke compensating handler RB-0000573-R279
281. Execute validation script `scripts/ops/treasury_step_280.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R280
282. Execute validation script `scripts/ops/treasury_step_281.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R281
283. Execute validation script `scripts/ops/treasury_step_282.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R282
284. Execute validation script `scripts/ops/treasury_step_283.sh`
   - Expected: return code 0 within 71 seconds
   - Rollback: invoke compensating handler RB-0000573-R283
285. Execute validation script `scripts/ops/treasury_step_284.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R284
286. Execute validation script `scripts/ops/treasury_step_285.sh`
   - Expected: return code 0 within 88 seconds
   - Rollback: invoke compensating handler RB-0000573-R285
287. Execute validation script `scripts/ops/treasury_step_286.sh`
   - Expected: return code 0 within 69 seconds
   - Rollback: invoke compensating handler RB-0000573-R286
288. Execute validation script `scripts/ops/treasury_step_287.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R287
289. Execute validation script `scripts/ops/treasury_step_288.sh`
   - Expected: return code 0 within 27 seconds
   - Rollback: invoke compensating handler RB-0000573-R288
290. Execute validation script `scripts/ops/treasury_step_289.sh`
   - Expected: return code 0 within 24 seconds
   - Rollback: invoke compensating handler RB-0000573-R289
291. Execute validation script `scripts/ops/treasury_step_290.sh`
   - Expected: return code 0 within 50 seconds
   - Rollback: invoke compensating handler RB-0000573-R290
292. Execute validation script `scripts/ops/treasury_step_291.sh`
   - Expected: return code 0 within 10 seconds
   - Rollback: invoke compensating handler RB-0000573-R291
293. Execute validation script `scripts/ops/treasury_step_292.sh`
   - Expected: return code 0 within 88 seconds
   - Rollback: invoke compensating handler RB-0000573-R292
294. Execute validation script `scripts/ops/treasury_step_293.sh`
   - Expected: return code 0 within 38 seconds
   - Rollback: invoke compensating handler RB-0000573-R293
295. Execute validation script `scripts/ops/treasury_step_294.sh`
   - Expected: return code 0 within 120 seconds
   - Rollback: invoke compensating handler RB-0000573-R294
296. Execute validation script `scripts/ops/treasury_step_295.sh`
   - Expected: return code 0 within 118 seconds
   - Rollback: invoke compensating handler RB-0000573-R295
297. Execute validation script `scripts/ops/treasury_step_296.sh`
   - Expected: return code 0 within 43 seconds
   - Rollback: invoke compensating handler RB-0000573-R296
298. Execute validation script `scripts/ops/treasury_step_297.sh`
   - Expected: return code 0 within 18 seconds
   - Rollback: invoke compensating handler RB-0000573-R297
299. Execute validation script `scripts/ops/treasury_step_298.sh`
   - Expected: return code 0 within 86 seconds
   - Rollback: invoke compensating handler RB-0000573-R298
300. Execute validation script `scripts/ops/treasury_step_299.sh`
   - Expected: return code 0 within 12 seconds
   - Rollback: invoke compensating handler RB-0000573-R299
301. Execute validation script `scripts/ops/treasury_step_300.sh`
   - Expected: return code 0 within 99 seconds
   - Rollback: invoke compensating handler RB-0000573-R300
302. Execute validation script `scripts/ops/treasury_step_301.sh`
   - Expected: return code 0 within 70 seconds
   - Rollback: invoke compensating handler RB-0000573-R301
303. Execute validation script `scripts/ops/treasury_step_302.sh`
   - Expected: return code 0 within 76 seconds
   - Rollback: invoke compensating handler RB-0000573-R302
304. Execute validation script `scripts/ops/treasury_step_303.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R303
305. Execute validation script `scripts/ops/treasury_step_304.sh`
   - Expected: return code 0 within 15 seconds
   - Rollback: invoke compensating handler RB-0000573-R304
306. Execute validation script `scripts/ops/treasury_step_305.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R305
307. Execute validation script `scripts/ops/treasury_step_306.sh`
   - Expected: return code 0 within 60 seconds
   - Rollback: invoke compensating handler RB-0000573-R306
308. Execute validation script `scripts/ops/treasury_step_307.sh`
   - Expected: return code 0 within 32 seconds
   - Rollback: invoke compensating handler RB-0000573-R307
309. Execute validation script `scripts/ops/treasury_step_308.sh`
   - Expected: return code 0 within 71 seconds
   - Rollback: invoke compensating handler RB-0000573-R308
310. Execute validation script `scripts/ops/treasury_step_309.sh`
   - Expected: return code 0 within 51 seconds
   - Rollback: invoke compensating handler RB-0000573-R309
311. Execute validation script `scripts/ops/treasury_step_310.sh`
   - Expected: return code 0 within 107 seconds
   - Rollback: invoke compensating handler RB-0000573-R310
312. Execute validation script `scripts/ops/treasury_step_311.sh`
   - Expected: return code 0 within 7 seconds
   - Rollback: invoke compensating handler RB-0000573-R311
313. Execute validation script `scripts/ops/treasury_step_312.sh`
   - Expected: return code 0 within 112 seconds
   - Rollback: invoke compensating handler RB-0000573-R312
314. Execute validation script `scripts/ops/treasury_step_313.sh`
   - Expected: return code 0 within 31 seconds
   - Rollback: invoke compensating handler RB-0000573-R313
315. Execute validation script `scripts/ops/treasury_step_314.sh`
   - Expected: return code 0 within 30 seconds
   - Rollback: invoke compensating handler RB-0000573-R314
316. Execute validation script `scripts/ops/treasury_step_315.sh`
   - Expected: return code 0 within 52 seconds
   - Rollback: invoke compensating handler RB-0000573-R315
317. Execute validation script `scripts/ops/treasury_step_316.sh`
   - Expected: return code 0 within 108 seconds
   - Rollback: invoke compensating handler RB-0000573-R316
318. Execute validation script `scripts/ops/treasury_step_317.sh`
   - Expected: return code 0 within 28 seconds
   - Rollback: invoke compensating handler RB-0000573-R317
319. Execute validation script `scripts/ops/treasury_step_318.sh`
   - Expected: return code 0 within 64 seconds
   - Rollback: invoke compensating handler RB-0000573-R318
320. Execute validation script `scripts/ops/treasury_step_319.sh`
   - Expected: return code 0 within 56 seconds
   - Rollback: invoke compensating handler RB-0000573-R319
321. Execute validation script `scripts/ops/treasury_step_320.sh`
   - Expected: return code 0 within 43 seconds
   - Rollback: invoke compensating handler RB-0000573-R320
322. Execute validation script `scripts/ops/treasury_step_321.sh`
   - Expected: return code 0 within 55 seconds
   - Rollback: invoke compensating handler RB-0000573-R321
323. Execute validation script `scripts/ops/treasury_step_322.sh`
   - Expected: return code 0 within 87 seconds
   - Rollback: invoke compensating handler RB-0000573-R322
324. Execute validation script `scripts/ops/treasury_step_323.sh`
   - Expected: return code 0 within 20 seconds
   - Rollback: invoke compensating handler RB-0000573-R323
325. Execute validation script `scripts/ops/treasury_step_324.sh`
   - Expected: return code 0 within 29 seconds
   - Rollback: invoke compensating handler RB-0000573-R324
326. Execute validation script `scripts/ops/treasury_step_325.sh`
   - Expected: return code 0 within 31 seconds
   - Rollback: invoke compensating handler RB-0000573-R325
327. Execute validation script `scripts/ops/treasury_step_326.sh`
   - Expected: return code 0 within 5 seconds
   - Rollback: invoke compensating handler RB-0000573-R326
328. Execute validation script `scripts/ops/treasury_step_327.sh`
   - Expected: return code 0 within 37 seconds
   - Rollback: invoke compensating handler RB-0000573-R327
329. Execute validation script `scripts/ops/treasury_step_328.sh`
   - Expected: return code 0 within 77 seconds
   - Rollback: invoke compensating handler RB-0000573-R328
330. Execute validation script `scripts/ops/treasury_step_329.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R329
331. Execute validation script `scripts/ops/treasury_step_330.sh`
   - Expected: return code 0 within 34 seconds
   - Rollback: invoke compensating handler RB-0000573-R330
332. Execute validation script `scripts/ops/treasury_step_331.sh`
   - Expected: return code 0 within 65 seconds
   - Rollback: invoke compensating handler RB-0000573-R331
333. Execute validation script `scripts/ops/treasury_step_332.sh`
   - Expected: return code 0 within 107 seconds
   - Rollback: invoke compensating handler RB-0000573-R332
334. Execute validation script `scripts/ops/treasury_step_333.sh`
   - Expected: return code 0 within 102 seconds
   - Rollback: invoke compensating handler RB-0000573-R333
335. Execute validation script `scripts/ops/treasury_step_334.sh`
   - Expected: return code 0 within 2 seconds
   - Rollback: invoke compensating handler RB-0000573-R334
336. Execute validation script `scripts/ops/treasury_step_335.sh`
   - Expected: return code 0 within 5 seconds
   - Rollback: invoke compensating handler RB-0000573-R335
337. Execute validation script `scripts/ops/treasury_step_336.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R336
338. Execute validation script `scripts/ops/treasury_step_337.sh`
   - Expected: return code 0 within 35 seconds
   - Rollback: invoke compensating handler RB-0000573-R337
339. Execute validation script `scripts/ops/treasury_step_338.sh`
   - Expected: return code 0 within 91 seconds
   - Rollback: invoke compensating handler RB-0000573-R338
340. Execute validation script `scripts/ops/treasury_step_339.sh`
   - Expected: return code 0 within 79 seconds
   - Rollback: invoke compensating handler RB-0000573-R339
341. Execute validation script `scripts/ops/treasury_step_340.sh`
   - Expected: return code 0 within 33 seconds
   - Rollback: invoke compensating handler RB-0000573-R340
342. Execute validation script `scripts/ops/treasury_step_341.sh`
   - Expected: return code 0 within 111 seconds
   - Rollback: invoke compensating handler RB-0000573-R341
343. Execute validation script `scripts/ops/treasury_step_342.sh`
   - Expected: return code 0 within 33 seconds
   - Rollback: invoke compensating handler RB-0000573-R342
344. Execute validation script `scripts/ops/treasury_step_343.sh`
   - Expected: return code 0 within 34 seconds
   - Rollback: invoke compensating handler RB-0000573-R343
345. Execute validation script `scripts/ops/treasury_step_344.sh`
   - Expected: return code 0 within 113 seconds
   - Rollback: invoke compensating handler RB-0000573-R344
346. Execute validation script `scripts/ops/treasury_step_345.sh`
   - Expected: return code 0 within 25 seconds
   - Rollback: invoke compensating handler RB-0000573-R345
347. Execute validation script `scripts/ops/treasury_step_346.sh`
   - Expected: return code 0 within 95 seconds
   - Rollback: invoke compensating handler RB-0000573-R346
348. Execute validation script `scripts/ops/treasury_step_347.sh`
   - Expected: return code 0 within 14 seconds
   - Rollback: invoke compensating handler RB-0000573-R347
349. Execute validation script `scripts/ops/treasury_step_348.sh`
   - Expected: return code 0 within 17 seconds
   - Rollback: invoke compensating handler RB-0000573-R348
350. Execute validation script `scripts/ops/treasury_step_349.sh`
   - Expected: return code 0 within 10 seconds
   - Rollback: invoke compensating handler RB-0000573-R349
351. Execute validation script `scripts/ops/treasury_step_350.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R350
352. Execute validation script `scripts/ops/treasury_step_351.sh`
   - Expected: return code 0 within 40 seconds
   - Rollback: invoke compensating handler RB-0000573-R351
353. Execute validation script `scripts/ops/treasury_step_352.sh`
   - Expected: return code 0 within 106 seconds
   - Rollback: invoke compensating handler RB-0000573-R352
354. Execute validation script `scripts/ops/treasury_step_353.sh`
   - Expected: return code 0 within 23 seconds
   - Rollback: invoke compensating handler RB-0000573-R353
355. Execute validation script `scripts/ops/treasury_step_354.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R354
356. Execute validation script `scripts/ops/treasury_step_355.sh`
   - Expected: return code 0 within 97 seconds
   - Rollback: invoke compensating handler RB-0000573-R355
357. Execute validation script `scripts/ops/treasury_step_356.sh`
   - Expected: return code 0 within 29 seconds
   - Rollback: invoke compensating handler RB-0000573-R356
358. Execute validation script `scripts/ops/treasury_step_357.sh`
   - Expected: return code 0 within 54 seconds
   - Rollback: invoke compensating handler RB-0000573-R357
359. Execute validation script `scripts/ops/treasury_step_358.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R358
360. Execute validation script `scripts/ops/treasury_step_359.sh`
   - Expected: return code 0 within 52 seconds
   - Rollback: invoke compensating handler RB-0000573-R359
361. Execute validation script `scripts/ops/treasury_step_360.sh`
   - Expected: return code 0 within 67 seconds
   - Rollback: invoke compensating handler RB-0000573-R360
362. Execute validation script `scripts/ops/treasury_step_361.sh`
   - Expected: return code 0 within 10 seconds
   - Rollback: invoke compensating handler RB-0000573-R361
363. Execute validation script `scripts/ops/treasury_step_362.sh`
   - Expected: return code 0 within 108 seconds
   - Rollback: invoke compensating handler RB-0000573-R362
364. Execute validation script `scripts/ops/treasury_step_363.sh`
   - Expected: return code 0 within 52 seconds
   - Rollback: invoke compensating handler RB-0000573-R363
365. Execute validation script `scripts/ops/treasury_step_364.sh`
   - Expected: return code 0 within 63 seconds
   - Rollback: invoke compensating handler RB-0000573-R364
366. Execute validation script `scripts/ops/treasury_step_365.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R365
367. Execute validation script `scripts/ops/treasury_step_366.sh`
   - Expected: return code 0 within 34 seconds
   - Rollback: invoke compensating handler RB-0000573-R366
368. Execute validation script `scripts/ops/treasury_step_367.sh`
   - Expected: return code 0 within 100 seconds
   - Rollback: invoke compensating handler RB-0000573-R367
369. Execute validation script `scripts/ops/treasury_step_368.sh`
   - Expected: return code 0 within 98 seconds
   - Rollback: invoke compensating handler RB-0000573-R368
370. Execute validation script `scripts/ops/treasury_step_369.sh`
   - Expected: return code 0 within 73 seconds
   - Rollback: invoke compensating handler RB-0000573-R369
371. Execute validation script `scripts/ops/treasury_step_370.sh`
   - Expected: return code 0 within 82 seconds
   - Rollback: invoke compensating handler RB-0000573-R370
372. Execute validation script `scripts/ops/treasury_step_371.sh`
   - Expected: return code 0 within 19 seconds
   - Rollback: invoke compensating handler RB-0000573-R371
373. Execute validation script `scripts/ops/treasury_step_372.sh`
   - Expected: return code 0 within 85 seconds
   - Rollback: invoke compensating handler RB-0000573-R372
374. Execute validation script `scripts/ops/treasury_step_373.sh`
   - Expected: return code 0 within 58 seconds
   - Rollback: invoke compensating handler RB-0000573-R373
375. Execute validation script `scripts/ops/treasury_step_374.sh`
   - Expected: return code 0 within 12 seconds
   - Rollback: invoke compensating handler RB-0000573-R374
376. Execute validation script `scripts/ops/treasury_step_375.sh`
   - Expected: return code 0 within 62 seconds
   - Rollback: invoke compensating handler RB-0000573-R375
377. Execute validation script `scripts/ops/treasury_step_376.sh`
   - Expected: return code 0 within 71 seconds
   - Rollback: invoke compensating handler RB-0000573-R376
378. Execute validation script `scripts/ops/treasury_step_377.sh`
   - Expected: return code 0 within 12 seconds
   - Rollback: invoke compensating handler RB-0000573-R377
379. Execute validation script `scripts/ops/treasury_step_378.sh`
   - Expected: return code 0 within 111 seconds
   - Rollback: invoke compensating handler RB-0000573-R378
380. Execute validation script `scripts/ops/treasury_step_379.sh`
   - Expected: return code 0 within 32 seconds
   - Rollback: invoke compensating handler RB-0000573-R379
381. Execute validation script `scripts/ops/treasury_step_380.sh`
   - Expected: return code 0 within 69 seconds
   - Rollback: invoke compensating handler RB-0000573-R380
382. Execute validation script `scripts/ops/treasury_step_381.sh`
   - Expected: return code 0 within 98 seconds
   - Rollback: invoke compensating handler RB-0000573-R381
383. Execute validation script `scripts/ops/treasury_step_382.sh`
   - Expected: return code 0 within 81 seconds
   - Rollback: invoke compensating handler RB-0000573-R382
384. Execute validation script `scripts/ops/treasury_step_383.sh`
   - Expected: return code 0 within 32 seconds
   - Rollback: invoke compensating handler RB-0000573-R383
385. Execute validation script `scripts/ops/treasury_step_384.sh`
   - Expected: return code 0 within 40 seconds
   - Rollback: invoke compensating handler RB-0000573-R384
386. Execute validation script `scripts/ops/treasury_step_385.sh`
   - Expected: return code 0 within 49 seconds
   - Rollback: invoke compensating handler RB-0000573-R385
387. Execute validation script `scripts/ops/treasury_step_386.sh`
   - Expected: return code 0 within 45 seconds
   - Rollback: invoke compensating handler RB-0000573-R386
388. Execute validation script `scripts/ops/treasury_step_387.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R387
389. Execute validation script `scripts/ops/treasury_step_388.sh`
   - Expected: return code 0 within 58 seconds
   - Rollback: invoke compensating handler RB-0000573-R388
390. Execute validation script `scripts/ops/treasury_step_389.sh`
   - Expected: return code 0 within 41 seconds
   - Rollback: invoke compensating handler RB-0000573-R389
391. Execute validation script `scripts/ops/treasury_step_390.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R390
392. Execute validation script `scripts/ops/treasury_step_391.sh`
   - Expected: return code 0 within 36 seconds
   - Rollback: invoke compensating handler RB-0000573-R391
393. Execute validation script `scripts/ops/treasury_step_392.sh`
   - Expected: return code 0 within 87 seconds
   - Rollback: invoke compensating handler RB-0000573-R392
394. Execute validation script `scripts/ops/treasury_step_393.sh`
   - Expected: return code 0 within 21 seconds
   - Rollback: invoke compensating handler RB-0000573-R393
395. Execute validation script `scripts/ops/treasury_step_394.sh`
   - Expected: return code 0 within 109 seconds
   - Rollback: invoke compensating handler RB-0000573-R394
396. Execute validation script `scripts/ops/treasury_step_395.sh`
   - Expected: return code 0 within 90 seconds
   - Rollback: invoke compensating handler RB-0000573-R395
397. Execute validation script `scripts/ops/treasury_step_396.sh`
   - Expected: return code 0 within 86 seconds
   - Rollback: invoke compensating handler RB-0000573-R396
398. Execute validation script `scripts/ops/treasury_step_397.sh`
   - Expected: return code 0 within 63 seconds
   - Rollback: invoke compensating handler RB-0000573-R397
399. Execute validation script `scripts/ops/treasury_step_398.sh`
   - Expected: return code 0 within 44 seconds
   - Rollback: invoke compensating handler RB-0000573-R398
400. Execute validation script `scripts/ops/treasury_step_399.sh`
   - Expected: return code 0 within 95 seconds
   - Rollback: invoke compensating handler RB-0000573-R399
