首先需求模型（RequirementModel）有两个属性，分别是名称（name）和描述（description），并且和对应的一个用例模型（usecasemodel）、多个系统顺序模型（workflow）、多个目标检测模型（ssd）和一个领域模型（DomainModel）相关联。领域模型（DomainModel）有两个属性，分别是名称（name）和标签（label）。

概念类图元模型描述的就是领域模型中构建系统的所有实体、实体的内部结构以及实体之间的关系。所以抽象出实体类（Entity），有三个属性，分别是是否可以执行修改删除等操作（isCRUD），名称（name）和描述（description）。实体类（Entity）之间的关系有多个聚合关系（aggregation），多个组成关系（composition），多个单向关联关系和多个双向关联关系（entity/entityOpposite）。领域模型（DomainModel）由多个实体类（Entity）和实体类之间关系组成（entity）。

每个实体都有许多属性和遵循的不变量。抽象出属性类（Attribute），有两个属性，名称（name）和是否为多重属性（isMultiple）。每个实体类（Entity）都由多个属性（Attribute）组成（attribute）。每个属性都有自己的类型，都和一个类型（type）相关联。抽象出不变量类（Invariance），有两个属性，名称（name）和是否用于实体之间关系（isForAssociation）。每种不变量都是对象约束语言表达式中的一部分，都和一个表达式（ocl）相关联。


```python

```
