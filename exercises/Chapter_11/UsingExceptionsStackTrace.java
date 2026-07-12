package exercises.Chapter_11;

public class UsingExceptionsStackTrace {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            StackTraceElement[] traceElements = exception.getStackTrace();
            for (StackTraceElement element:traceElements){
                System.out.println("Class:"+element.getClassName()+" File:"+element.getFileName()+" Line:"+element.getLineNumber()+" Method:"+element.getMethodName());
            }
        }

    }
    public static void method1() throws Exception{
        method2();
    }
    public static void method2() throws Exception{
        method3();
    }
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3.");
    }
}
