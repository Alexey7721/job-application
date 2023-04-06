# __Job application__

```
          ____________                                    __   __
      __/@/@/@/@/@/@/@/_   ______  ____        _______   /@/  /@/   
   __/@/  ________   /@/  /@/@/@/ /@/@/_   __/@/@/@/@/  __   /@/    
  /@/  __/@/@/@/@/  /@/  /@/   /@/   /@/  /@/     /@/  /@/  /@/     
 /@/  /@/_____/@/__/@/  /@/   /@/   /@/  /@/_____/@/  /@/  /@/      
/@/_   /@//@//@//@/    /@/   /@/   /@/    /@/@/@/@/  /@/  /@/       
 /@/_____________________________________________________
  /@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/@/
```

[//]: # (![Java]&#40;icons/label.png&#41;)


## __Описание__
### Заполнение анкеты и отправка уведомелния на почту.
Работа с [JavaMailSenderImpl](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/mail/javamail/JavaMailSenderImpl.html);


## __Языки и инструменты__

[![IntelliJ IDEA](icons/intellij-idea-48.png)](https://www.jetbrains.com/idea/)
[![Java](icons/java-coffee-cup-48.png)](https://www.java.com/ru/)
[![Spring](icons/spring-48.png)](https://spring.io/)
[![XML](icons/xml-48.png)](https://www.xml.com/)
[![HTML](icons/html-48.png)](https://html.com/)
[![Hibenate Validator](icons/hibernate-validator.png)](https://hibernate.org/validator/)
[![Apache Tomcat](icons/apache-tomcat-48.png)](https://tomcat.apache.org/)
[![Visual studio code](icons/visual-studio-code-2019-48.png)](https://code.visualstudio.com/)
<br>

## __Установка и настойка__
### Для запуска даного проекта нужно: 
1. Скачать [apache-tomcat](https://tomcat.apache.org/download-80.cgi).
2. Отредактировать конфигурацию указав путь к [apache-tomcat](https://tomcat.apache.org/download-80.cgi).
3. В [application.properties](https://github.com/Alexey7721/job-application/blob/master/src/main/resources/application.properties) укажите данные почты, с которой будет отправляться уведомление.

```
mail.host=smtp.gmail.com
mail.port=587
mail.username=АДРЕС ПОЧТЫ
mail.password=ПАРОЛЬ
```




