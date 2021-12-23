![123.png](attachment:123.png)

![1234.png](attachment:1234.png)

将领域模型（DomainModel）设置为根节点，浅灰色的大方框代表实体（Entity），也就是元模型中的Entity类；深灰色小方框代表属性（Attribute），也就是元模型中的Attribute类。实心菱形+实心箭头表示组成关系（Composition），也就是元模型中的composition；单向空心箭头表示继承关系（Generation），也就是元模型中的superentity；空心菱形+实心箭头表示聚合关系，也就是元模型中的aggregation；双向实心箭头表示双向关联（Bi-direction），也就是元模型中的entity/entityOpposite；单向实心箭头表示单向关联（Reference），也就是元模型中的reference。

![12345.png](attachment:12345.png)

用一个家庭模型测试元模型和图形的映射关系，在此模型中成功测试了Entity、Attribute、Composition、Generation和Bi-direction图形的使用。家庭类（family）包含住址属性（address），由父母类（parent）和孩子类（child）组成（Composition），孩子类（child）对父母类（parent）有继承关系（Generation）；父母类（parent）包含工作属性（work），由父亲类（father）和母亲类（mother）组成，父亲类（father）和母亲类（mother）双向关联（Bi-direction）；父亲类（father）包含名字属性（name）和年龄属性（age）；母亲类包含名字属性（name）和年龄属性（age）；孩子类（child）包含学校属性（school），由儿子类（son）组成。


```python

```
