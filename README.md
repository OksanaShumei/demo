Основні функції:

http://localhost:8080/rest/store  -   повертає список складів

http://localhost:8080/rest/store/{sid}  -  повертає інформацію тільки про конкретний склад і дозволяє редагувати і видаляти склад

http://localhost:8080/rest/store/{sid}/goods  -  повертає список товарів з конкретного складу

http://localhost:8080/rest/store/{sid}/goods/{gid}  -  повертає інформацію про конкретний товар і дозволяє редагувати чи видаляти

Додаткові функції:

1. Пошук складів і товарів по імені
     - http://localhost:8080/rest/search/{name} - пошук складів
     - http://localhost:8080/rest/search/goods/{name} - пошук товарів
2. Додатковий ендпойнт /goods для роботи з усіма товарами незалежно від складу
     - http://localhost:8080/rest/goods
3. Розбивка результатів видачі на сторінки
