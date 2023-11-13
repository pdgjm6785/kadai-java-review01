
public class Review01 {

    public static void main(String[] args) {
        // 変数の宣言・代入
        int shina1 = 1500;
        double zeikin1 = 0.1;

        //　double型resultを宣言、double型引値を２つ受け取るメソットの定義（戻り値なし）
        double result = taxMethod1(shina1, zeikin1);

        //　演算結果を表示する
        System.out.println(shina1 + "円の商品の税込価格は" + (int)(shina1 + result) + "円(消費税は" + (int)result + "円)です。");
    }

    // double型引数を２つ受け取るメソットの定義（戻り値あり）
    public static int taxMethod1(int shina1, double zeikin1) {
        double result = shina1 * zeikin1;
        return (int) result;
    }
}