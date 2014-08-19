package projecttest

class Project {
	String name;
	String code;
	String techLead;
	String manager;
	Date deliveryDate;
	Phase phase;
	int priority;
	
	enum Phase {
		briefing, scoping, interaction, development, qa, release
	}

    static constraints = {
		name blank : false, unique : true, matches : "[A-Za-z0-9 ]*";
		code blank : false, unique : true, matches : "[A-Za-z0-9 ]*";;
		techLead blank:false;
		manager blank:false;
		priority min :1, unique : true;
    }
	
	static mapping = {
		sort "priority";
	}
}
