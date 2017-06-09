# Tienda de antigüedades
Aplicación demostrativa de una base de datos orientada a objetos utilizando **ObjectDB** con Java.

**Descargue ObjectDB [AQUI](http://www.objectdb.com/object/db/database/download)**

Proyecto realizado con NetBeans para el curso CE-3101: Bases de Datos. Instituto Tecnológico de Costa Rica.

A continuación se presenta una pequeña aplicación para una compra y venta de antigüedades. Los objetos involucrados en la aplicación son:
* **PERSON**: Interfaz para herencia, define como es una persona dentro del sistema.
* **EMPLOYEE**: Hereda de PERSON. Empleado en el sistema.
* **CLIENT**: Hereda de PERSON. Cliente registrado en el sistema.
* **ITEM**: Registro de una antigüedad en el sistema.
* **SALE**: Registro de una venta realizada en la tienda.
* **PURCHASE**: Registro de una compra que la tienda realizó a un cliente.

En el diagrama siguiente, se definen las relaciones entre los objetos anteriores:
![Digrama de clases](https://i.imgur.com/hJDhj5z.png "Diagrama de clases")

A continuación se define la estructura de las clases usando el lenguaje de modelado definido por el estándar ODMG:

**ITEM**:
```
class ITEM
(  extent ITEMS
   key itemID  )
{  attribute string itemID;
   attribute string description;
   attribute float askingPrice;
   attribute enum condition { excellent, good, satisfactory, poor };
   attribute string comments;
   relationship SALE sold_in inverse SALE::item_sold;
   relationship PURCHASE bought_in inverse PURCHASE::item_bought;
};
```

**SALE:**
```
class SALE
(  extent SALES  
   key saleID  )
{  attribute float commissionPaid;
   attribute float sellingPrice;
   attribute float salesTax;
   attribute Date dateSold;
   relationship ITEM item_sold inverse ITEM::sold_in;
   relationship CLIENT buyerC inverse CLIENT::participates_in;
   relationship EMPLOYEE seller inverse EMPLOYEE::sells_item;
   void sellItem (string clientID, string itemID, string employeeID);
};
```

**PURCHASE:**
```
class PURCHASE 
(  extent PURCHASES
   key purchaseID  )
{  attribute float purchaseCost;
   attribute Date purchaseDate;
   attribute enum condition { excellent, good, satisfactory, poor }; 
   relationship ITEM item_bought inverse ITEM::bought_in;
   relationship CLIENT sellerC inverse CLIENT::involved_in;
   relationship EMPLOYEE buyer inverse EMPLOYEE::bought_item;
   void buyItem (string clientID, string itemID, string employeeID);
};
```

**PERSON:**
```
class PERSON {
(  extent PERSONS 
   key ID )
{  attribute string ID;
   attribute struct name { string Fname, 
                           string Mname,
                           string Lname }  Name;
   attribute enum gender { M, F };
   attribute string phone; 
};
```

**CLIENT:**
```
class CLIENT extends PERSON {
(  extent CLIENTS )
{  attribute struct Address { string city,
                     string province } Address;
   relationship set<SALE> participates_in inverse SALE::buyerC;
   relationship set<PURCHASE> involved_in inverse PURCHASE::sellerC;
};
```

**EMPLOYEE:**
```
class EMPLOYEE extends PERSON {
(  extent EMPLOYEES )
{  attribute float salary;
   attribute int ext;
   attribute string office;
   attribute date birthDate;
   relationship set<SALE> participates_in inverse SALE::buyer;
   relationship set<PURCHASE> involved_in inverse PURCHASE::seller;
   short Age();
};
```
