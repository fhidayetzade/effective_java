package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestDrive {
    /*Reflection - işləmə zamanı Java virtual maşınında (JVM) işləyən proqramların çalışma zamanında (runtime)
     davranışını yoxlamaq və istiqamətləndirmək imkanı verən xüsusiyyətdir.*/

    public static void main(String[] args) {
        try {
            Class worked = Class.forName("reflection.Worked");
            Constructor  [] constructors=worked.getConstructors();
            Constructor  [] declaredConstructors=worked.getDeclaredConstructors();

            Field[] field=worked.getFields();
            Field [] declaredField=worked.getDeclaredFields();

            Method [] method=worked.getMethods();
            Method [] declaredMethod=worked.getDeclaredMethods();

            for (Constructor c: constructors){
                System.out.println("constructor "+c.getName());
            }

            for (Constructor decC: declaredConstructors){
                System.out.println("declaredConstructor "+decC.getName());
            }

            for (Field f: field){
                System.out.println("Field "+f.getName());
            }

            for (Field decF: declaredField){
                System.out.println("declaredField "+decF.getName());
            }

            for (Method m: method){
                System.out.println("Method "+m.getName());
            }

            for (Method decM: declaredMethod){
                System.out.println("declaredMethod "+decM.getName());
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
