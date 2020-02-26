public class MissingGradeException extends Exception{
	private long studentid;
	public MissingGradeException(int i) {
		// TODO Auto-generated constructor stub
	}
	public long getStudentId(){
		return studentid;
	}
	public long setStudentId(long studentId){
		return this.studentid=studentId;
	}
}
