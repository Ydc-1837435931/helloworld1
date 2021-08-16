package kaoshi;

public class Solutioner{
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 返回能够覆盖的最大人口数量
     * @param populationDistribute int整型一维数组 人口覆盖情况
     * @param stationCoverage int整型 公交站覆盖范围
     * @return int整型
     */
    public int GetMaxCoverage (int[] populationDistribute, int stationCoverage) {
        // write code here
        int k = stationCoverage;
        int[] a = new int[1 + 2 * k];
        int[] b = new int[1 + 2 * k];
        int[] c = new int[1 + 2 * k];
        int[] d = new int[1 + 2 * k];
        int sum = 0;
        int len = populationDistribute.length;
        int[] abcd = new int[len-k];
        for (int i = 1; i < len-k ; i++) {
            abcd[i] = 0;
            for (int j = 0; j < (2*k+1)  ; j++) {
                abcd[i] += populationDistribute[j];
            }
        }
        int max = abcd[0];
        for (int i = 0; i < (len-k); i++) {
            int temp = abcd[i+1];
            if (max < temp){
                max = abcd[i+1];

            }
        }

        return max;
    }
}