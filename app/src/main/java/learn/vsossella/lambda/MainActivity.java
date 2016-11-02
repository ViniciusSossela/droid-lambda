package learn.vsossella.lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    Button lambdaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonListenerWithLambda();
    }

    private void buttonListenerWithLambda() {
        lambdaButton = (Button)findViewById(R.id.lambda_button);
        lambdaButton.setOnClickListener(v -> Toast.makeText(this, "Heey, lambda works!", Toast.LENGTH_SHORT).show());
    }

    private void buttonListenerWithoutLambda() {
        Button button = (Button)findViewById(R.id.lambda_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Button clicked without lambda", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void lambdaWayFilter() {
        List<User> olderUsers = usersList().stream().filter(u -> u.age > 30).collect(Collectors.toList());
    }

    private void oldJavaWay() {
        List<User> olderUsers = new ArrayList<>();
        for (User u : usersList()) {
            if (u.age > 30) {
                olderUsers.add(u);
            }
        }
    }

    private List<User> usersList() {
        return Arrays.asList(
                new User(1, "Steve", "Vai", 40),
                new User(4, "Joe", "Smith", 32),
                new User(3, "Steve", "Johnson", 57),
                new User(9, "Mike", "Stevens", 18),
                new User(10, "George", "Armstrong", 24),
                new User(2, "Jim", "Smith", 40),
                new User(8, "Chuck", "Schneider", 34),
                new User(5, "Jorje", "Gonzales", 22),
                new User(6, "Jane", "Michaels", 47),
                new User(7, "Kim", "Berlie", 60)
        );
    }

    public class User {
        private int id;
        private String name;
        private String lastName;
        private int age;

        public User(int id, String name, String lastName, int age) {
            setId(id);
            setName(name);
            setLastName(lastName);
            setAge(age);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}


