package BuilderPattern;

public class BuilderPattern { 
    private int a;
    private int b;
    private int c;
    private int d;
    
    public static class Builder {
    	private int a;
        private int b;
        private int c;
        private int d;
        
        public Builder a(int a) {
        	this.a = a;
        	return this;
        }
        public Builder b(int b) {
        	this.b = b;
        	return this;
        }
        public Builder c(int c) {
        	this.c = c;
        	return this;
        }
        public Builder d(int d) {
        	this.d = d;
        	return this;
        }
        public BuilderPattern build() {
        	return new BuilderPattern(this);
        }
    }
    
    private BuilderPattern(Builder builder) {
    	this.a = builder.a;
    	this.b = builder.b;
    	this.c = builder.c;
    	this.d = builder.d;
    }
}