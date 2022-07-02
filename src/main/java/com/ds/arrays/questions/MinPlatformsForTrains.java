package com.ds.arrays.questions;

import java.util.Arrays;

public class MinPlatformsForTrains {

    public static void main(String[] args) {
        int A[] = {1026, 0445, 0145, 0555, 0710, 1712, 1105, 0506, 0531, 1930, 0220, 0611, 0553, 0053, 0401, 2000, 0225, 1359, 1159, 0120, 1857, 0740, 0253, 0303, 0740, 1434, 1407, 807, 0423, 0500, 851, 809, 0527, 0123, 1117, 0023, 1050, 1613, 1025, 1225, 826, 0422, 0221, 28, 0515, 0401, 1241, 38, 0315, 1007, 508, 1054, 803, 0333, 0011, 0225, 0137, 0030, 0344, 0036, 841, 1419, 0552, 0422, 0337, 1222, 1422, 0010, 258, 1434, 538, 0153, 808, 0347, 0104, 1136, 0302, 0357, 938, 2015, 0403, 258, 0736, 1057, 1547, 0531, 1642, 2333, 0511, 1301, 1059, 638, 0117, 0314, 905, 1314, 1103, 0356, 0006, 0235, 1209, 849, 0304, 539, 921, 0625, 0741, 0047, 0055, 0127, 0003, 0053, 608, 1725, 1431, 1427, 814, 935, 1435, 938, 448, 930, 549, 1002, 909, 329, 1203, 824, 0212, 852, 1825, 0541, 1136, 825, 0110, 1301, 1619, 0031, 0037, 0140, 0443, 831, 1220, 0346, 1242, 1414, 1702, 0113, 901, 1221, 0742, 941, 0711, 825, 0220, 1526, 0125, 0006, 1418, 1632, 1020, 1957, 0711, 0552, 0430, 0157, 359, 0212, 1150, 2212, 857, 1351, 1531, 219, 0006, 813, 0141, 1730, 458, 911, 1201, 218, 0441, 1121, 0216, 0501, 528, 1049, 158, 0646, 1303, 18, 0123, 1408, 1750, 0604, 1042, 0001, 1049, 0343, 821, 0154, 139, 1138, 1138, 2107, 318, 0556, 1259, 0044, 0457, 0116, 1555, 1546, 0525, 1648, 1612, 0504, 1218, 2231, 1408, 922, 1253, 0353, 759, 0727, 817, 0015, 0650, 519, 1723, 1329, 0357, 839, 0440, 824, 805, 1524, 943, 0116, 937, 0740, 0357, 1023, 0314, 931, 1844, 1639, 0232, 0023, 549, 28, 1135, 1220, 449, 925, 1112, 1652, 609, 2316, 1205, 0133, 0223, 0543, 1004, 1426, 814, 0422, 1134, 228, 832, 0641, 1643, 1339, 1725, 1023, 1017, 1642, 0627, 0642, 934, 1349, 0624, 1411, 0246, 508, 1113, 955, 0014, 258, 0502, 749, 1423, 0400, 809, 0157, 2100, 0120, 935, 1417, 1204, 1016, 0144, 0724, 1221, 0207, 1745, 1905, 0333, 0324, 1407, 1537, 1246, 1543, 0226, 1031, 1045, 1325, 957, 419, 528, 419, 1239, 0131, 0452, 834, 0003, 0430, 0544, 348, 538, 952, 1956, 0024, 1140, 0407, 800, 0026, 1101, 1301, 838, 0555, 816, 0130, 1645, 0025, 0013, 0136, 810, 1624, 819, 811, 1138, 0622, 1643, 1113, 1434, 1311, 1501, 847, 950, 0356, 0305, 1825, 1135, 946, 1550, 0211, 835, 539, 0335, 1123, 904, 938, 812, 1339, 1921, 1511, 709, 0130, 1222, 820, 0405, 0330, 1254, 0432, 0130, 0033, 0254, 826, 0343, 830, 1708, 0657, 1149, 1148, 0406, 1204, 1253, 1006, 0421, 258, 2022, 1027, 0110, 1426, 458, 128, 39, 0537, 0737, 1938, 849, 0424, 1332, 0140, 1123, 0103, 0250, 0600, 749, 0247, 1243, 108, 138, 1119, 0443, 409, 0343, 0654, 0413, 658, 0333, 0022, 739, 0453, 0051, 0104, 0240, 1201, 1328, 208, 0242, 1020, 1305, 708, 0630, 1314, 1018, 1104, 2137, 0224, 1051, 0543, 838, 539, 0606, 949, 1435, 1034, 0402, 1105, 936, 0530, 946, 1629, 1641, 0744, 0023, 508, 0036, 0300, 0756, 0302, 0733, 0600, 2009, 804, 0653, 1312, 0024, 1217, 0345, 0301, 1450, 0103, 1512, 905, 0000, 0012, 854, 0451, 0317, 0336, 0125, 0400, 829, 0202, 927, 0257, 0511, 0406, 1548, 0453, 1518, 1057, 2016, 0522, 938, 0346, 0536, 1723, 0531, 0727, 0232, 1050, 0155, 738, 2012, 957, 0555, 0504, 0652, 1301, 0522, 0351, 0136, 0511, 0334, 0410, 933, 805, 1603, 1808, 0105, 0325, 1814, 0024, 0552, 0401, 0041, 1412, 800, 0133, 0007, 0755, 2005, 1258, 1034, 1215, 0014, 1553, 807, 0310, 1416, 0246, 0243, 0026, 857, 2157, 1605, 0555, 1322, 0253, 1130, 0702, 1350, 0050, 0105, 0345, 0121, 0350, 0300, 1616, 448, 1008, 0737, 629, 0700, 945, 0045, 817, 1947, 549, 1451, 1732, 935, 0135, 0132, 408, 1407, 1801, 1640, 0050, 0313, 0021, 308, 1320, 1207, 2216, 1918, 0111, 348, 0621, 0030, 842, 818, 28, 1056, 1941, 1635, 1111, 508, 0420, 139, 1036, 0717, 1250, 0320, 0536, 8, 156, 808, 1754, 451, 0432, 0236, 1128, 912, 1326, 1525, 0526, 0355, 439, 0223, 1702, 2109, 0503, 1629, 0224, 0107, 1649, 1338, 0722, 840, 923, 0001, 0144, 0102, 1128, 839, 329, 0443, 1402, 1132, 0226, 0422, 0456, 0157, 1126, 458, 1114, 0600, 0012, 0301, 0313, 1213, 0210, 1110, 0205, 0034, 0042, 0320, 0313, 0101, 0253, 0301, 0311, 1539, 1911, 835, 1556, 1049, 0017, 0530, 1604, 0002, 0410, 0117, 428, 1638, 930, 349, 708, 1327, 118, 929, 0402, 0437, 2143, 0424, 0751, 0230, 2321, 0030, 1555, 1446, 0404, 1135, 914, 1305, 0215, 0455, 0356, 1216, 0302, 815, 1357, 952, 1051, 0036, 59, 0030, 0147, 0403, 1720, 0722, 1509, 0423, 0207, 428, 0214, 1227, 448, 0111, 0206, 248, 0313, 0246, 0424, 1416, 738, 1240, 558, 1625, 548, 739, 0134, 0704, 0656, 836, 0302, 0553, 0105, 0101, 0115, 1438, 208, 0244, 1503, 1231, 1619, 0616, 934, 1524, 800, 0740, 1146, 0347, 1002, 1550, 943, 0657, 0256, 559, 0234, 0745, 1002, 709, 801, 0345, 1138, 0536, 2214, 659, 0427, 850, 0145, 1938, 0726, 328, 0407, 1512, 358, 439, 538, 0326, 2305, 0015, 854, 1636, 0403, 1556, 218, 1139, 1319, 1042, 0216, 1103, 0206, 1519, 920, 228, 0203, 0444, 911};
        int B[] = {1713, 2242, 1144, 848, 1941, 1734, 2347, 1726, 2247, 2018, 0355, 2249, 2134, 758, 2044, 2354, 0237, 2152, 1221, 0532, 2031, 820, 1013, 2311, 2150, 2321, 1909, 2344, 1732, 2127, 2126, 1602, 945, 0705, 1632, 1305, 1604, 1639, 1630, 1334, 1858, 2131, 0350, 1625, 1443, 926, 1245, 1802, 1558, 1406, 1442, 2024, 1450, 0703, 508, 1341, 1445, 1624, 1414, 2143, 1306, 1808, 845, 1717, 1928, 1620, 1631, 1101, 2146, 2153, 1524, 2306, 944, 0702, 1219, 1318, 1431, 2044, 1616, 2106, 1631, 841, 1128, 1732, 1957, 719, 2052, 2342, 2016, 1348, 1505, 957, 1749, 509, 2140, 1515, 2114, 1245, 1806, 1439, 1951, 2341, 518, 2315, 2304, 1117, 1701, 1837, 0346, 2200, 118, 1537, 0714, 1757, 2237, 2139, 2103, 1707, 2031, 1848, 1623, 2105, 2125, 1205, 1730, 0512, 1928, 1816, 2250, 1624, 1828, 1227, 2308, 1044, 809, 1636, 2101, 0321, 0121, 1237, 1157, 1633, 1731, 2050, 1419, 1724, 2155, 0705, 2109, 2343, 844, 2246, 2037, 1452, 1131, 2135, 1441, 549, 1810, 2039, 2306, 2215, 1057, 739, 2323, 1250, 1024, 1856, 2152, 2238, 2323, 1855, 1920, 0454, 1008, 2059, 1556, 2202, 1645, 2320, 1843, 1812, 1011, 2052, 1639, 1555, 2234, 2025, 1502, 2224, 1742, 957, 1527, 2110, 1929, 1712, 2159, 239, 2113, 1841, 2211, 1221, 1028, 2124, 1614, 2139, 2240, 926, 1527, 1839, 0721, 2316, 1931, 1648, 817, 1707, 2002, 921, 2342, 2336, 1842, 2257, 1925, 827, 1800, 1349, 1949, 1242, 906, 1954, 1732, 1721, 2010, 2349, 2034, 1527, 1328, 2000, 2130, 1804, 1745, 1105, 1406, 2245, 1649, 1411, 2300, 2330, 0713, 0553, 2329, 0632, 1556, 1942, 1446, 1510, 1253, 2341, 1532, 2322, 1810, 0445, 1953, 1619, 1436, 2145, 1115, 0715, 1245, 2126, 1834, 2101, 2326, 1850, 1736, 1346, 1914, 1806, 0727, 2249, 1611, 1700, 1410, 1910, 1831, 1355, 2136, 2157, 229, 0446, 1022, 1914, 1709, 1717, 1442, 1748, 2156, 0651, 1424, 1951, 2304, 1154, 2200, 1059, 1510, 2047, 2142, 2013, 1303, 901, 2134, 1927, 1256, 2205, 709, 2129, 1602, 1336, 1045, 821, 2352, 1559, 1626, 1224, 0627, 2134, 1348, 1827, 1508, 1001, 1051, 1546, 2101, 1934, 2011, 2339, 1807, 953, 2005, 1542, 2144, 1448, 2203, 0452, 1934, 1309, 0622, 853, 1814, 1812, 1557, 2039, 1920, 1627, 2149, 1955, 1519, 1312, 1702, 2252, 1107, 1049, 0420, 2128, 1717, 2146, 1751, 1413, 2335, 1815, 817, 1907, 2211, 1023, 2318, 1423, 1957, 1616, 2012, 2308, 1259, 2114, 808, 1527, 2135, 1638, 1956, 408, 0655, 1346, 0527, 1248, 2055, 2235, 1358, 1501, 907, 2101, 2244, 2108, 929, 2200, 2056, 1532, 0256, 1900, 2218, 1358, 0214, 1414, 1105, 2311, 1232, 0611, 1848, 1543, 1459, 0743, 1143, 1905, 2241, 1758, 1446, 0136, 2323, 1705, 2057, 0504, 2029, 1708, 1642, 1945, 926, 802, 1821, 1028, 1145, 1527, 1531, 1419, 1730, 0243, 0324, 2131, 2117, 2022, 1426, 1836, 1540, 1319, 2337, 2304, 1948, 1607, 1220, 1407, 1804, 2209, 2025, 1412, 1729, 2134, 1353, 905, 1529, 1647, 2345, 848, 835, 947, 1710, 1325, 1519, 2255, 803, 1008, 2048, 2005, 1952, 2328, 1717, 1523, 2043, 2141, 1711, 1030, 2211, 1522, 0202, 0043, 1022, 1848, 1457, 1313, 448, 0722, 1601, 2005, 1042, 1802, 2114, 1145, 2253, 2209, 2210, 1705, 2128, 0624, 1345, 1648, 2009, 2242, 1248, 2214, 1019, 2020, 1447, 2144, 2119, 2056, 2356, 1646, 1002, 2331, 0657, 428, 0422, 608, 1149, 2047, 1900, 1241, 2358, 2201, 0755, 1351, 2317, 1623, 2205, 1518, 2210, 1518, 1657, 1838, 2026, 822, 2203, 1449, 1639, 1313, 2241, 1814, 1023, 1611, 1626, 708, 1743, 0125, 2302, 2254, 2143, 1922, 1710, 0604, 1204, 2020, 1414, 1947, 409, 1747, 0626, 0751, 1729, 1710, 2334, 2304, 1750, 839, 1120, 1929, 1640, 1605, 1951, 1433, 1607, 2306, 1343, 2203, 0622, 2341, 1705, 1905, 2318, 1218, 1946, 1354, 0344, 1803, 1858, 2229, 2237, 2303, 946, 1420, 1956, 1118, 2246, 1957, 1738, 2038, 2217, 1217, 1236, 836, 1816, 1744, 832, 1932, 2300, 2037, 1304, 0514, 1004, 2257, 1722, 2112, 1221, 2035, 1956, 1918, 1833, 2225, 1823, 1505, 1952, 2343, 2110, 1611, 2024, 0233, 1220, 1935, 1750, 1457, 1212, 1003, 1126, 1034, 0454, 1922, 1714, 2323, 1619, 1446, 1943, 1543, 2243, 1114, 840, 2212, 2316, 1258, 1126, 629, 0514, 1416, 1608, 1821, 1442, 842, 1554, 1251, 1231, 1030, 1804, 2051, 2339, 0714, 2109, 2232, 1423, 2351, 1853, 1919, 1637, 2250, 1155, 2106, 2029, 1646, 2330, 1719, 2153, 1156, 1925, 0417, 2039, 1118, 2131, 2238, 2355, 1730, 2142, 2357, 1210, 1956, 1626, 0611, 1409, 2256, 2243, 1157, 2324, 1509, 2001, 1022, 1845, 2333, 2255, 1305, 935, 0646, 0113, 1348, 2333, 2304, 1522, 2207, 2018, 408, 1657, 1757, 1547, 1404, 849, 1549, 2102, 0331, 1622, 1827, 2135, 2307, 1635, 1137, 1805, 945, 1822, 2027, 1657, 954, 2358, 0340, 850, 1720, 811, 0715, 2121, 1826, 1626, 2004, 1405, 1931, 2246, 2047, 2218, 1022, 1439, 1401, 1900, 2130, 2328, 2119, 1851, 428, 1235, 1811, 1040, 1906, 2212, 1937, 1405, 2210, 0710, 2359, 1021, 759, 1406, 0312, 2110, 1238, 839, 2110, 2021, 854, 850, 912, 2329, 2350, 1253, 1802, 2114, 0632, 2350, 900, 2204, 1853, 1419, 1038, 1556, 259, 1601, 1738, 1701, 2302, 2140, 1147};
       /* int[] A = {900, 940, 950, 1100, 1500, 1800};
        int[] B = {910, 1200, 1120, 1130, 1900, 2000};*/


        System.out.println(findMinPlatformsForTrains(A, B));
    }

    private static int findMinPlatformsForTrains(int[] A, int[] B) {
        int platforms = 1;

        A = Arrays.stream(A).sorted().toArray();
        B = Arrays.stream(B).sorted().toArray();

        int x = 1;
        int j = 0;
        int i = 1;
        while (i < A.length) {
            if (A[i] > B[j]) {
                j++;
                x--;
            } else {
                i++;
                x++;
            }

            if (platforms < x) platforms = x;
        }

        return platforms;
    }
}
