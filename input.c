#define PI 3.14159
#define FACTOR 2


void ShowValues ( int x , int y , int z  ) { 
	int d, e, f, g;
	float r2, r3, r4, r5;

	printfln( 'First value: ', x );
	printfln( 'Second value: ', y );

} 

int Multiply ( int n1 , int n2  ) { 
	int n2;

	return = n1 * n2 ;

} 

float CircleArea ( float radius  ) { 
	return = PI * radius  * radius ;

} 

void PruebaIf ( void ) { 
	int x, y;

	x = 10;
	y = 20;
	if( x>y ) {
		printf( 'x es mayor que y' );

	}else {
		printf( 'y es mayor o igual que x' );

	}
} 

int PruebaCond ( int x,y  ) { 
	int a, b, c;

	a = 10;
	b = 20;
	c = 30;
	if( (a<b)&&(b<c) ) {
		printf( 'a < b < c' );

	}else if( !(a==b) ) {
		printf( 'a no es igual a b' );

	}else {
		printf( 'a no es igual a b' );

	}
} 

void PruebaWhile ( void ) { 
	int counter;

	counter = 0;
	while(counter<5) {
		printf( 'counter: ', counter );
		counter = counter + 1 ;
	}

} 

void PruebaRepeat ( void ) { 
	int counter;

	counter = 0;
	do {
		printf( 'counter: ', counter );
		counter = counter + 1 ;

	}until(counter>=5);
} 

void ejemploForTo ( void ) { 
	int i;

	for(i=1; i<=5; i++) {
		printf( 'Iteración: ', i );

	}
} 

void ejemploForDownto ( void ) { 
	int i;

	for(i=5; i>=1; i--) {
		printf( 'Iteración: ', i );

	}
} 

void main ( void ) {
	int a, b, c;
	float r, area;
	a = 5;
	b = 10;
	c = Multiply( a, b );
	ShowValues( a, c );
	r = 7.5;
	area = CircleArea( r );
	x1 = +123.456;
	x2 = 123.456;
	x3 = +12E+5;
	x4 = -3e-10;
	x5 = +123e5;
	x6 = -45E12;
	x7 = 456E+2;
	x8 = 10e-3;
	x9 = 123e4;
	x10 = 6E9;
	x11 = +12.34e+5;
	x12 = -0.99E-2;
	x13 = -123.45e6;
	x14 = +0.01E9;
	x15 = 987.65e+4;
	x16 = 3.1415E-2;
	x17 = 123.456e7;
	x18 = 1.0E3;
	printfln( 'Radius: ', r );
	printfln( 'Area of circle: ', area );
	printfln( 'Constant factor: ', FACTOR );
	
}