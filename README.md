# postmemberof
It is example for post on javappa.com page.

Post ten jest formą ćwiczenia, dlatego udostępniamy kod zródłowy w postaci pliku zip. 
Możecie go ściągnąć i własnoręcznie przetestować. 
Do pełnego zrozumienia przykładu wymagana jest wiedza ogólna dotycząca Spring Data JPA, 
a w szczególności zapytań własnych (custom queries), które opisujemy w naszym kursie Spring-a 
w rozdziale <a href="https://www.javappa.com/kurs-spring/spring-data-jpa-zapytania-wlasne" target="_blank">Spring Data JPA - Zapytania wlasne (Custom Queries)</a>.

Załóżmy teraz, że w pewnej aplikacji webowej, napisanej z użyciem Spring Boot-a przechowujemy 
użytkowników uprawnionych do korzystania z tej aplikacji. Każdy z nich posiada przypisane elementy (itemy). 
Mamy więc encje User, w której przechowujemy encje Items. 
Relacja między encjami jest określona obustronnie jako @ManyToMany. 
Dla tak zdefiniowanej relacji chcemy okreslić zapytanie Spring Data Repositories zwracające wszystkie obiekty Item, 
które nie są przypisane do konkretnego użytkownika...

Więcej na stronie: <a href="https://www.javappa.com/blog/backend/spring-data-repositories-query-i-member-of" target="_blank">Spring Data Repositories Query i member of</a>
