package observer;

/**
 * Интерфейс погоды
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notyfiObserver();


}
