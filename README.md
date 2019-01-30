# postmemberof
It is example for post on javappa.com page.

Post ten jest formą ćwiczenia, dlatego udostępniamy kod zródłowy w postaci pliku zip. 
Możecie go ściągnąć i własnoręcznie przetestować. 
Do pełnego zrozumienia przykładu wymagana jest wiedza ogólna dotycząca Spring Data JPA, 
a w szczególności zapytań własnych (custom queries), które opisujemy w naszym kursie Spring-a 
w rozdziale Spring Data JPA - Zapytania wlasne (Custom Queries).

Załóżmy teraz, że w pewnej aplikacji webowej, napisanej z użyciem Spring Boot-a przechowujemy 
użytkowników uprawnionych do korzystania z tej aplikacji. Każdy z nich posiada przypisane elementy (itemy). 
Mamy więc encje User, w której przechowujemy encje Items. 
Relacja między encjami jest określona obustronnie jako @ManyToMany. 
Dla tak zdefiniowanej relacji chcemy okreslić zapytanie Spring Data Repositories zwracające wszystkie obiekty Item, 
które nie są przypisane do konkretnego użytkownika.
