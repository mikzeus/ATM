import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName,password;

        int select,tryEnter = 3,balance = 5000;
        int money;


        while(tryEnter>0){

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = inp.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = inp.nextLine();

            if(userName.equals("haydi") && password.equals("m123")){
                System.out.println("Giriş yaptınız, KENT Banka hoşgeldiniz");

                System.out.println("hangi işlemi yapmak istiyorsunuz?");

                do{
                    System.out.println("hesaptaki parayı görüntülemek için 1\n" +
                            "Paranızı çekmek için 2\n" +
                            "hesabınıza Para yatırmak için 3\n" +
                            "işleminizi sonlandırmak için 4'ü tuşlayınız.");

                    select = inp.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Hesabındaki para: "+balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı giriniz.");
                            money = inp.nextInt();

                            if(money>balance){
                                System.out.println("Hesabınızda yeterli para bulunmamaktadır.");
                            } else{
                                balance -= money;
                                System.out.println("Kalan paranız: "+balance);
                            }
                            break;
                        case 3:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz.");
                            money= inp.nextInt();
                            balance += money;
                            System.out.println("pranız hesabınıza yatırldı, yeni para miktarınız: "+balance);
                            break;
                        case 4:
                            System.out.println("işlemleriniz sonlandırıldı, sistemden çıkış yapılıyor");
                            break;
                        default:
                            System.out.println("Hatalı tuşlama. Tekrar deneyiniz.");
                    }

                }
                while(select!=4);
                break;

            }
                tryEnter--;
                if(tryEnter==0){
                    System.out.println("3 defa yanlış giriş yaptığınız için hesabınız bloke olmuştur\n" +
                            "lütfen bankanızla iletişime geçiniz!!!");
                }
                else{
                    System.out.println("Kullanıcı adı veya şifre yanlış girdiniz.\n" +
                            "Tekrar deneyiniz.Kalan deneme hakkınız: "+tryEnter);
                }
            }
        }

    }

