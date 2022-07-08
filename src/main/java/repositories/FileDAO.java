package repositories;

import java.util.List;

/**
 * Сущность реализующая контракт действия
 */
public interface FileDAO {

    /**
     * Сохранение данных в файл
     *
     * @param data данные
     */
    void saveToFile(String data);

    /**
     * Чтение данных из файла
     *
     * @return коллекция строк из файла
     */
    List<String> readFromFile();

    /**
     * Удаление файла
     */
    void deleteFile();

}
