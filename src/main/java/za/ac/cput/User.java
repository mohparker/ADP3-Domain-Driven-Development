package za.ac.cput;

public class User {

        private String userId;
        private String firstName;
        private String lastName;
        private String email;
        private String ticketId;
        private int ticketsBought;
        private int bookedSeats;


        private  User(Builder builder){
            this.userId=builder.userId;
            this.firstName=builder.firstName;
            this.lastName=builder.lastName;
            this.email=builder.email;
            this.ticketId=builder.ticketId;
            this.ticketsBought=builder.ticketsBought;
            this.bookedSeats=builder.bookedSeats;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTicketId() {
            return ticketId;
        }

        public void setTicketId(String ticketId) {
            this.ticketId = ticketId;
        }

        public int getTicketsBought() {
            return ticketsBought;
        }

        public void setTicketsBought(int ticketsBought) {
            this.ticketsBought = ticketsBought;
        }

        public int getBookedSeats() {
            return bookedSeats;
        }

        public void setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId='" + userId + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", ticketId='" + ticketId + '\'' +
                    ", ticketsBought=" + ticketsBought +
                    ", bookedSeats=" + bookedSeats +
                    '}';
        }

        public static class Builder{
            private String userId;
            private String firstName;
            private String lastName;
            private String email;
            private String ticketId;
            private int ticketsBought;
            private int bookedSeats;


            public Builder setUserId(String userId) {
                this.userId = userId;
                return this;
            }

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setTicketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            public Builder setTicketsBought(int ticketsBought) {
                this.ticketsBought = ticketsBought;
                return this;
            }

            public Builder setBookedSeats(int bookedSeats) {
                this.bookedSeats = bookedSeats;
                return this;
            }

            public Builder copy(User user){
                this.userId=user.userId;
                this.firstName=user.firstName;
                this.lastName=user.lastName;
                this.email=user.email;
                this.ticketId=user.ticketId;
                this.ticketsBought=user.ticketsBought;
                this.bookedSeats=user.bookedSeats;
                return this;
            }
            public User builder(){
                return new User(this);
            }
        }

    }
