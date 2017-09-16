import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		try{this.students=students;}// Add your implementation here
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		try{// Add your implementation here
                this.students[index]=student;}
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public void addFirst(Student student) {
	      try{  // Add your implementation here
                int x=this.students.length;
		Student[] s=new Student[x+1];
		s[0]=student;
		for(int i=0;i<x;i++)
                {
		s[i+1]=this.students[i];
		}
		this.students=s;}
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public void addLast(Student student) {
		try{// Add your implementation here
      		int x=this.students.length;
		Student[] s=new Student[x+1];
		s[x]=student;
		for(int i=0;i<x;i++)
                {
		s[i]=this.students[i];
		}
		this.students=s;}
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public void add(Student student, int index) {
		try{// Add your implementation here
		 int x=this.students.length;
		Student[] s=new Student[x+1];
		for(int i=0;i<index;i++)
                {
		s[i]=this.students[i];
		}
		for(int i=index+1;i<=x;i++)
		{
		s[i]=this.students[i-1];
		}
                s[index]=student;
		this.students=s;}
		
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public void remove(int index) {
		try{// Add your implementation here
                int x=this.students.length;
		Student[] s=new Student[x-1];
		for(int i=0;i<index;i++)
                {
		s[i]=this.students[i];
		}
		for(int i=index;i<x-1;i++)
		{
		s[i]=this.students[i+1];
		}
		this.students=s;}
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
	}

	@Override
	public void remove(Student student) {
		try{// Add your implementation here
		int x=this.students.length;
		for(int i=0;i<x;i++)
 		{
		if(this.students[i]==student)
		{
		Student[] s=new Student[x-1];
		for(int m=0;m<i;m++)
                {
		s[m]=this.students[m];
		}
		for(int j=i;j<x-1;j++)
		{
		s[j]=this.students[j+1];
		}
		this.students=s;
		break;
		}
		
		}}
		
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}	
	}

	@Override
	public void removeFromIndex(int index) {
		try{// Add your implementation here
		Student[] s=new Student[index+1];
		for(int i=0;i<=index;i++)
		{
		s[i]=this.students[i];
		}
		this.students=s;}
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try{int x=this.students.length;
		for(int i=0;i<x;i++)
 		{
		if(this.students[i]==student)
		{
		Student[] s=new Student[i+1];
		for(int m=0;m<=i;m++)
                {
		s[m]=this.students[m];
		}
		
		this.students=s;
		break;
		}
		}
		  }
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try{		
		 int x=this.students.length;
		Student[] s=new Student[x-index];
		
		for(int i=index;i<x;i++)
		{
		s[i-index]=this.students[i];
		}
		this.students=s;
                   }
		catch(IllegalArgumentException ex)
                {System.out.println(ex);}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		try{
		int x=this.students.length;
		for(int i=0;i<x;i++)
 		{
		if(this.students[i]==student)
		{
		Student[] s=new Student[x-i];
		for(int m=i;m<=x;m++)
                {
		s[m-i]=this.students[m];
		}
		
		this.students=s;
		break;
		}
		}
		  }
                catch(IllegalArgumentException ex)
                {System.out.println(ex);}
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		int x=this.students.length,m=0,n=0;
		for(int i=0;i<x;i++)
		{if(this.students[i].getBirthDate().compareTo(date)<=0){m++;}}
		Student[] s=new Student[m];
		if(m !=0)
                {
		for(int i=0;i<x;i++)
		{if(this.students[i].getBirthDate().compareTo(date)<=0){s[n]=this.students[i];n++;}}
		}
		return this.students=s;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		int x=this.students.length,m=0,n=0;
		for(int i=0;i<x;i++)
		{if(this.students[i].getBirthDate().compareTo(firstDate)>=0 && this.students[i].getBirthDate().compareTo(lastDate)<=0){m++;}}
		Student[] s=new Student[m];
		if(m !=0)
                {
		for(int i=0;i<x;i++)
		{if(this.students[i].getBirthDate().compareTo(firstDate)>=0 && this.students[i].getBirthDate().compareTo(lastDate)<=0)
		  {s[n]=this.students[i];n++;}}
		}
		return this.students=s;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double sum=0;
		int x=this.students.length,m=0,n=0;
		for(int i=0;i<x;i++)
		{
		sum=sum+this.students[i].getAvgMark();
		}
		double totalAvg=sum/x;
		for(int i=0;i<x;i++)
		{if(this.students[i].getAvgMark()==totalAvg){m++;}}
		Student[] s=new Student[m];
		if(m !=0)
                {
		for(int i=0;i<x;i++)
		{if(this.students[i].getAvgMark()==totalAvg){s[n]=this.students[i];n++;}}
		}
		return this.students=s;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i=0;Student sd;
		
		int x=this.students.length;
		for( i=0;i<x;i++)
 		{
		if(this.students[i]==student)
		{break;}
		}return this.students[i+1];
		   
		
	}
}
