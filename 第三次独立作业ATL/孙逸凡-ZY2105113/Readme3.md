目标元模型为组织关系元模型（OrganizationMetamodel）。根据初始元模型中类和类之间的关系，如果一个类由其它几个类组成（composition）或聚合而成（aggregation），则在新的元模型中转换为管理部门（AdministerDepartment）；如果一个类和其它类单向关联（reference），则在新的元模型中转换为技术部门（TechniqueDepartment）；如果一个类和其它类双向关联（entity/entityOpposite），则在新的元模型中转换为财务部门（FinanceDepartment）；如果一个类继承了另一个类（superentity），则在新的元模型中转换为人事部门（StaffDepartment）。同时获取初始元模型中类的名称属性（name）和描述属性（description）作为新的类中的两个属性。

待转换模型：在DomainModel的基础上定义了五个类，分别具有名字属性“CEO1”和描述属性“biggerCEO”，“CEO2”和“smallerCEO”，“Producer”和“creater”，“Cashier”和“consume”，“Staff”和“tinyStaff”,并分别具有“composition”、“aggregation”、“reference”、“entityOpposite”和“superentity”的向下层类的联系。

转换后模型：转换结果是具有“composition”、“aggregation”、“reference”、“entityOpposite”、“superentity”的向下层类的联系的类分别转换成了AdministerDepartment、TechniqueDepartment、FinanceDepartment、StaffDepartment，并将原来类中的属性继承下来变成了新的属性。


```python

```
