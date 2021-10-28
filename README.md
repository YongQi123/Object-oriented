# Object-oriented
面向对象的分析与设计
Requiremodel是系统的需求模型
RequireDocument是系统的需求
|  GitHub 用户名  |      昵称       |  姓名  |
| :-------------: | :-------------: | :----: |
|     liyang1206     |     liyang1206     | 李阳 |
|     PlayerY     |     PlayerY     | 杨沛业 |
|    yt    | yt | 闫涛 |
| UnClover | UnClover |  孙逸凡  |
|     YongQi123      |     YongQi123      | 卜永祺 |

下面是系统概念类图以及需求功能的介绍

首先抽象出了一个用户(User)基类，包括两个基本的属性(attribute)：员工名字(Name)和证件号(ID)。

学院管理员(CollegeAdministrator)、系统后台管理员(Administrator)和赛事组织者(TournamentOrganizer)都是派生自用户基类的派生类。
它们继承有员工名字(Name)和证件号(ID)两个属性。在此基础上，学院和学院之间还要彼此区分，因此学院管理员(CollegeAdministrator)增加学院信息(CollegeImformation)属性。
抽象出报名者类(Participant)，包括三个基本的属性(attribute)：学生名字(Name)、学生证件号(ID)和报名赛事(ConpetitionItems)。
两个继承类学院管理员(CollegeAdministrator)、系统后台管理员(Administrator)都可以对报名者信息(Participant)进行录入(ModifyAthleteInfomation)。

抽象出赛事类(Conpetition)和赛事结果类(ConpetitionResult)。
赛事类(Conpetition)有四个属性：赛事名称(CompetitionItems)、赛事编号(CompetitionID)、赛事开始时间(StartTime)和赛事结束时间(EndingTime)。
赛事结果类有四个属性:赛事名称(CompetitionItems)、赛事成就(Achievement)、学生名字(Name)、学生证件号(ID)。
每一个具体赛事都有相对应的赛事结果(CompetitiontoCompetitionResults)。
后台管理员可以登入赛事的信息(SetRegistrationOpeningAndClosingTimes)。
赛事组织者可以登入赛事结果(CompetitiontoCompetitionResults)。

报名者可以报名某几项赛事(ParticipanttoCompetition)。
报名者可以查询赛事结果(ParticipanttoCompetitionResults)。
