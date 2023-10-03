package dependency_injection;

public class MainDependecny {
    public static void main(String[] args) {



        DependencyInjection_Tercume DI_Tercume=new DependencyInjection_Tercume(new Luget("Italian"));
        DI_Tercume.isValid();

        //biz italian yerine, istediyimiz dili gondere bilerik. Bele olan zaman, algorithm daha cevikdir.

    }
}
