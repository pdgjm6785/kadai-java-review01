
public class review01 {

    public static void main(String[] args) {
        // 変数の宣言・初期化
        int shina1 = 100;
        int zeikin1 = 10;
        int result;
        result = sumMethod1(shina1, zeikin1);
        System.out.println(shina1 + " 円の商品の税込価格は " + (shina1 + result) + " 円(消費税は " + result +  " 円)です。 ");

    }

    public static int sumMethod1(int shina1, int zeikin1) {
        int result = shina1 / zeikin1;
        return result;
    }
}