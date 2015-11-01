

void talk(PersonPtr p){
	printf("Hi, my name's %s and my age is %i.\n", p->name, p->age);
}
void commentAboutAge(PersonPtr p){
	if (p->age < 5){
		printf("baby\n");
	}
	else if (p->age == 5){
		printf("time to start school\n");
	}
}

PersonPtr make_person(String aName, int anAge){
	PrsonPtr p = malloc(sizeof(struct Person));
	p-> name = aName;
	p->age = anAge;
	return p;
}

int main (void){
	PersonPtr ls = make_person("Luke Skywalker", 34);
	PersonPtr wp = make_person("Winston Peters", 48);
	
	talk(ls);
	talk(wp);
	
	return 0;
}