package learngeneric;

public class App {
    public static void main(String[] args) {
        MyData myData1 = new MyData("Um Pontianak");

        Data data1 = new Data("Untan");
        Data data2 = new Data(1959);

        Data data3 = new Data("Mokoginta");
        Data data4 = new Data(true);
        Data data5 = new Data(3.75f);
        Data data6 = new Data(2002);

        DataPair mhs1name = new DataPair<>("211220038", "Imam Taufiq");
        DataPair mhs1ip = new DataPair<>("211220038", 4.0f);
        DataPair mhs1year = new DataPair<>("211220038", 2021);
        DataPair mhs2 = new DataPair<>(211220051, "Iskandar Madiatma");

        String[] beberapaSiswa = {"Saddam", "Rahma Wati", "Mustafa"};
        System.out.println(ArrayHelper.count(beberapaSiswa));
        Float[] nilaibeberapaSiswa = {3.75f, 3.2f, 3.63f};
        System.out.println(ArrayHelper.count(nilaibeberapaSiswa));

        Data<String> data9 = new Data<>("Molyadi");
        Data<? extends Object> data10 =data9;
        Data<Number> data11 = new Data<>(20);
        Data<? super Integer  > data12= data11;


    }
}
