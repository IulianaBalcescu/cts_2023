package Builder;

public class Main {
    public static void main(String[]args)
    {
        ContBancar contBancar=new ContBancar();
        contBancar.setDetinator("Ion Popescu");
        contBancar.setSuma(1000);
        contBancar.setMoneda("RON");
        contBancar.setContSalariu(true);
        contBancar.setInternetBanking(true);
        contBancar.setCardAtasat(true);

        System.out.println(contBancar.toString());

        ContBancar contBancar2=new ContBancarBuilder().setDetinator("Andrei Ionescu").setSuma(2000)
                .setCardAtasat(true).setContSalariu(true).build();
        System.out.println(contBancar2.toString());
    }
}
/*
* O banca pune la dispoziția clienților săi posibilitatea de creare de conturi
pentru care dacă un client dorește poate să seteze să fie contul în care să
primească salariul, să fie cu card atașat sau să aibă internet banking. În
cazul în care clientul nu setează aceste informații, contul este creat fără
aceste facilități.
* */