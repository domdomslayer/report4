public class Main {
    public static void main(String[] args){
        try{
            String str = "百二十三";
            int value = Integer.parseInt(str);
        }catch(NullPointerException e){
            System.out.println("エラー「NullPointerExeption」が発生しました。");
            System.out.println(e.getMessage());
        }

    }
}
