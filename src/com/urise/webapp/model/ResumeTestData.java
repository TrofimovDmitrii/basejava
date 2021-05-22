package com.urise.webapp.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;

public class ResumeTestData {
	public static Resume getResume(String uuid, String fullName) {
		Resume resume = new Resume(uuid, fullName);

		resume.addContacts(ContactType.PHONE, "+7(921) 855-0482");
		resume.addContacts(ContactType.MAIL, "gkislin@yandex.ru");
		resume.addContacts(ContactType.LINKEDIN, "https://www.linkedin.com/in/gkislin");
		resume.addContacts(ContactType.GITHUB, "https://github.com/gkislin");
		resume.addContacts(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/548473");
		resume.addContacts(ContactType.HOME_PAGE, "http://gkislin.ru/");
		resume.addSection(SectionType.OBJECTIVE, new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям"));
		resume.addSection(SectionType.PERSONAL, new TextSection("Аналитический склад ума, сильная логика, креативность, инициативность. Пурист кода и архитектуры."));

		resume.addSection(SectionType.ACHIEVEMENT, new ListSection(Arrays.asList(
				"С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", \"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. Более 1000 выпускников.",
				"Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike.Интеграция с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.",
				"Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. Разработка приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.",
				"Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.",
				"Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии через систему мониторинга Nagios. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django).",
				"Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа.")));

		resume.addSection(SectionType.QUALIFICATIONS, new ListSection(Arrays.asList(
				"JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2",
				"Version control: Subversion, Git, Mercury, ClearCase, Perforce",
				"DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle,",
				"MySQL, SQLite, MS SQL, HSQLDB",
				"Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy,",
				"XML/XSD/XSLT, SQL, C/C++, Unix shell scripts,",
				"Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security,Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium (htmlelements).",
				"Python: Django.",
				"JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js",
				"Scala: SBT, Play2, Specs2, Anorm, Spray, Akka",
				"Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, MDB, JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, OAuth1, OAuth2, JWT.",
				"Инструменты: Maven + plugin development, Gradle, настройка Ngnix,",
				"администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, OpenCmis, Bonita, pgBouncer.",
				"Отличное знание и опыт применения концепций ООП, SOA, шаблонов проектрирования, архитектурных шаблонов, UML, функционального программирования",
				"Родной русский, английский \"upper intermediate\"")));

		resume.addSection(SectionType.EXPERIENCE, new Organization(Arrays.asList(
				new Experience(
						"Автор проекта",
						"Создание, организация и проведение Java онлайн проектов и стажировок.",
						LocalDate.of(2013, 10, 1),
						LocalDate.now(),
						"https://javaops.ru/"),
				new Experience(
						"Старший разработчик (backend)",
						"Проектирование и разработка онлайн платформы управления проектами Wrike(Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO.",
						LocalDate.of(2014, 10, 1),
						LocalDate.of(2016, 1, 1),
						"https://www.wrike.com/"),
				new Experience(
						"Java архитектор",
						"Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO. Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python.",
						LocalDate.of(2012, 4, 1),
						LocalDate.of(2014, 10, 1),
						"RIT Center"),
				new Experience(
						"Ведущий программист",
						"Участие в проекте Deutsche Bank CRM (WebLogic, Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация клиентской и серверной части CRM. Реализация RIA-приложения для администрирования, мониторинга и анализа результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Highstock, Commet, HTML5.",
						LocalDate.of(2010, 12, 1),
						LocalDate.of(2012, 4, 1),
						"http://www.luxoft.ru/"),
				new Experience(
						"Ведущий специалист",
						"Дизайн и имплементация Java EE фреймворка для отдела \"Платежные Системы\" (GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и мониторинга фреймворка. Разработка online JMX клиента (Python/ Jython, Django, ExtJS)",
						LocalDate.of(2008, 6, 1),
						LocalDate.of(2010, 12, 1),
						"https://www.yota.ru/"),
				new Experience(
						"Разработчик ПО",
						"Реализация клиентской (Eclipse RCP) и серверной (JBoss 4.2, Hibernate 3.0, Tomcat, JMS) частей кластерного J2EE приложения (OLAP, Data mining).",
						LocalDate.of(2007, 3, 1),
						LocalDate.of(2008, 6, 1),
						"http://enkata.com/"),
				new Experience(
						"Разработчик ПО",
						"Разработка информационной модели, проектирование интерфейсов, реализация и отладка ПО на мобильной IN платформе Siemens @vantage (Java, Unix).",
						LocalDate.of(2005, 1, 1),
						LocalDate.of(2007, 2, 1),
						"https://new.siemens.com/"),
				new Experience(
						"Инженер по аппаратному и программному тестированию",
						"Тестирование, отладка, внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM).",
						LocalDate.of(1997, 9, 1),
						LocalDate.of(2005, 1, 1),
						"http://www.alcatel.ru/"))));

		resume.addSection(SectionType.EDUCATION, new Organization(Arrays.asList(
				new Experience(
						"Coursera",
						"'Functional Programming Principles in Scala' by Martin Odersky",
						LocalDate.of(2013, 3, 1),
						LocalDate.of(2013, 5, 1),
						"https://www.coursera.org/learn/progfun1"),
				new Experience(
						"Luxoft",
						"Курс 'Объектно-ориентированный анализ ИС. Концептуальное моделирование на UML'.",
						LocalDate.of(2011, 3, 1),
						LocalDate.of(2011, 4, 1),
						"https://www.luxoft-training.ru/kurs/obektno-orientirovannyy_analiz_i_proektirovanie_na_uml.html"),
				new Experience(
						"Siemens AG",
						"3 месяца обучения мобильным IN сетям (Берлин).",
						LocalDate.of(2005, 1, 1),
						LocalDate.of(2005, 4, 1),
						"https://new.siemens.com/ru/ru.html"),
				new Experience(
						"Alcatel",
						"6 месяцев обучения цифровым телефонным сетям (Москва).",
						LocalDate.of(1997, 9, 1),
						LocalDate.of(1998, 3, 1),
						"http://www.alcatel.ru/"),
				new Experience(
						"Университет ИТМО",
						"Аспирантура (программист С, С++) , Инженер (программист Fortran, C)",
						LocalDate.of(1987, 9, 1),
						LocalDate.of(1996, 7, 1),
						"https://itmo.ru/ru/"),
				new Experience(
						"Заочная физико-техническая школа при МФТИ",
						"Закончил с отличием.",
						LocalDate.of(1987, 9, 1),
						LocalDate.of(1993, 7, 1),
						"http://www.school.mipt.ru/"))));
		return resume;
	}

	public static void main(String[] args) {
		Resume resume_1 = getResume("uuid1", "Григорий Кислин");
		System.out.println(resume_1.getUuid());
		System.out.println(resume_1.getFullName());
		System.out.println();
		for (Map.Entry <ContactType, String> entry : resume_1.getContacts().entrySet()) {
			System.out.println(entry.getKey().getTitle() + ": " + entry.getValue());
		}
		System.out.println();
		for (Map.Entry <SectionType, AbstractSection> entry : resume_1.getSections().entrySet()) {
			System.out.println(entry.getKey().getTitle() + ": ");
			System.out.println(entry.getValue());
		}
	}
}