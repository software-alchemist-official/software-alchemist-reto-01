package reto01.model;

import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("CallToPrintStackTrace")
public class MethodExecutor implements Runnable {

    private final String metodName;
    private final ClaseMala cm;

    public MethodExecutor(String metodName, ClaseMala cm) {
        this.metodName = metodName;
        this.cm = cm;
    }

    @Override
    public void run() {
        try {
            cm.getClass().getMethod(metodName).invoke(cm);
        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
