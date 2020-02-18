-- выведите всю таблицу
SELECT * FROM Jaegers;

-- отобразите только не уничтоженных роботов
SELECT modelName, mark, status FROM Jaegers WHERE status = 'Alive';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6' ORDER BY mark;

-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM Jaegers ORDER BY mark DESC;

-- отобразите самого старого робота
SELECT modelName, mark, launch FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

-- отобразите роботов, которые уничтожили больше всех kaiju
SELECT modelName, mark, kaijukill FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

-- отобразите роботов, которые уничтожили меньше всех kaiju
SELECT modelName, mark, kaijukill FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);

-- отобразите средний вес роботов
SELECT AVG(weight) FROM Jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Alive';

-- удалите уничтоженных роботов
DELETE FROM Jaegers WHERE status = 'Destroyed';



