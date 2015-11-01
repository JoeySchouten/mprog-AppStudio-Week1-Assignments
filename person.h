typedef char *String;
typedef struct Person *PersonPtr;

struct Person{
	*String name;
	int age;
}

void talk(PersonPtr p);
void commentAboutAge(PersonPtr p);
PersonPtr make_person(String aName, int anAge);