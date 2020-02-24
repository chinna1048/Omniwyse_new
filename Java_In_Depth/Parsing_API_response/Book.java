public class Book {		
        private String title;
		private String author;
		private int publicationYear;
		private double averageRating;
		private int ratingsCount;
		private String imageUrl;
		
		// Add getters & setters for author, averageRating, and ratingsCount
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
        //Adding getter and setter for author
        public String getAuthor(){
            return author;
        }
        public void setAuthor(String author){
            this.author = author;
        }
		
		public int getPublicationYear() {
			return publicationYear;
		}
		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}
		//Adding getter and setter for averageRating
        public double getAverageRating() {
        return averageRating;
        }
        public void setAverageRating(double averageRating){
            this.averageRating = averageRating;
        }

        //Adding getter and setter for averageRating getRatingsCount
        public int getRatingsCount() {
            return ratingsCount;
        }
        public void setRatingsCount(int ratingsCount){
            this.ratingsCount = ratingsCount;
        }
        
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
	}