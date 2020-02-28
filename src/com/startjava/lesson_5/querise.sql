-- выведите всю таблицу
SELECT * FROM jaegers;

-- отобразите только не уничтоженных роботов
SELECT model_name, mark, status FROM jaegers WHERE status = 'Alive';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6' ORDER BY mark;

-- отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;

-- отобразите самого старого робота
SELECT model_name, mark, launch FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- отобразите роботов, которые уничтожили больше всех kaiju
SELECT model_name, mark, kaiju_kill FROM jaegers WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers);

-- отобразите роботов, которые уничтожили меньше всех kaiju
SELECT model_name, mark, kaiju_kill FROM jaegers WHERE kaiju_kill = (SELECT MIN(kaiju_kill) FROM jaegers);

-- отобразите средний вес роботов
SELECT AVG(weight) FROM jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status = 'Alive';

-- удалите уничтоженных роботов
DELETE FROM jaegers WHERE status = 'Destroyed';
