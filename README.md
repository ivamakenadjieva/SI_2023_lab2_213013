Ива Макенаџиева, бр. на индекс 213013

Control Flow Graph

![Screenshot 2023-05-28 092421](https://github.com/ivamakenadjieva/SI_2023_lab2_213013/assets/108795055/3efacf4f-7fec-415c-b50c-0c7ef0b9d763)


Цикломатска комплексност                                                                                                                                                
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата R+1, каде што R е бројот на региони. Во случајoв R=1, па цикломатската комплексност изнесува 11.
Истата вредност ја потврдив и со формулата Р+1, каде Р е број на предикатни јазли кој е еднаков на 10, значи цикломатската комплексност изнесува 11.

Тест случаи според критериумот Every branch

![Screenshot 2023-05-28 092235](https://github.com/ivamakenadjieva/SI_2023_lab2_213013/assets/108795055/c76137e7-0d2c-4302-9617-78186b577aee)

Потребни ни се 5 тест случаи за да напавиме тестирање според Every Branch, и тоа се:

1.user=null                                                                                                                                                   
  allUsers = null  // Во овој случај го изминуваме реброто 1-2 и 2-26, бидејќи го исполнува условот user==null и во јазел 2 ќе фрли исклучок
  
  
2.username=null                                                                                                                                                       
  password = fi123!                                                                                                                                               
  email = iva.makena@gmail.com                                                                                                                                        
  allUsers = { User(sofi.gr97@hotmail.com, mkdir123#,sofi.gr97@hotmail.com), User(iva.makena@gmail.com, fi123!, iva.makena@gmail.com) }   
  // Во овој тест случај ги исполнува условите user.getEmail().contains("@") && user.getEmail().contains("."), што значи дека ќе го помине реброто 6-7, ќе стигне до for циклусот и ќе ги помине сите ребра и јазли кој го сочинуваат.
  //Исто така ќе се изминат ребрата 18-19 и 19-26  бидејќи го исполнува условот password.length()<8 и во јазел 19 ќе терминира
  
3.username=ivamakena                                                                                                                                                                                    
  password =finki123*                                                                                                                                                                          
  email = iva.makena                                                                                                                                                            
  allUsers = null       //Во овој тест случај ќе се помине реброто 18-20 и ќе продолжи во for циклусот бидејќи го исполнува условот !passwordLower.contains(" "). Исто така ќе го помине реброто 23-26 бидејќи password-от содржи * и поради тоа ќе терминира

4.username=ivamakena                                                                                                                                                                                      
  password =finki 123*                                                                                                                                                                       
  email = iva.makena                                                                                                                                                          
  allUsers = null     //Во овој тест случај ќе се помине реброто 20-25 бидејќи не го исполнува условот !passwordLower.contains(" ").
  
5.username=ivamakena                                                                                                                                                                                           
password =finki12345                                                                                                                                                                             
email = iva.makena                                                                                                                                                               
allUsers = null   //Овој тест случај ќе го помине реброто 24-25 бидејќи тестот ќе влезе во for циклусот кој започнува во јазел 21.1, но password-от не содржи специјален знак што значи дека ќе излеземе од циклусот без тој да терминира.


Тест случаи според критериумот Multiple Condition

![Screenshot 2023-05-28 084643](https://github.com/ivamakenadjieva/SI_2023_lab2_213013/assets/108795055/b7974382-e431-440e-b4ee-def62e683d1e)

При пишување тест случаи според критериумот Multiple Condition и притоа разгледуваме состојба во која имаме 3 услови поврзани со ||(или) , минимален број на тест случаи е 4.
Ознаката Х во напишаната табела на сликата ни кажува дека не е важно дали тој услов е исполнет или не во тој тест пример, бидејќи знаме дека при "или" доколку наидеме на исполнет услов, не продолжуваме да ги тестираме и преостанатите.
Исто така во овие случаи не ни е важно што имаме во листата allUsers.
Ги разгледуваме следните тест случаи:
1. user = null  // Го исполнува првиот услов, што значи останатите два не се проверуваат - влегува во if блокот со наредби
2. user = User(iva,null, null)  //Првиот услов не е исполнет, но вториот услов е исполнет , значи третиот нема да се провери - влегува во if блокот со наредби
3. user = User(iva,finki123*, null) //Првите два услови не се исполнети, но третиот е исполнет  - влегува во if блокот со наредби
4. user = User(iva, finki123*, iva.makena@gmail.com) //Во овој тест случај ни еден од условите не е исполнет што значи нема да влезе со блокот со наредби
 

Објаснување на напишаните unit tests

Во методот everyBranchMethod() се тестираат тест случаите од горенаведената точка "Тест случаи според критериумот Every branch".
Во првиот тест случај се очекува да се фрли исклучок, додека останатите очекуваме да вратат false. Нашите очекувања се потврдени со правењето на овие тестови.

Во методот multipleConditionMethod() се тестираат тест случаите од горенаведената точка "Тест случаи според критериумот Multiple Condition".
Во првиот, вториот и третиот тест случај се очекува да се фрли исклучок, додека последниот очекуваме да врати true. Нашите очекувања се потврдени со правењето на овие тестови.


