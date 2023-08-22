class EnglishMovies{
static String englishmovies[]={"Averenge" , "Python"};
public static void main(String movies []){
	System.out.println(englishmovies.length);

System.out.println("The english movies are " + englishmovies[0] + englishmovies[1]);

// for
for(int englishIndex=0 ; englishIndex < englishmovies.length ; englishIndex++){
	System.out.println(englishmovies[englishIndex]);
}

for(String movie : englishmovies){
	System.out.println(movie);
}

}
}
//for(declaration ond codition of variable ; ){}





