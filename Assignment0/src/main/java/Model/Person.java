package Model;

/**
 * Created by michaelhilton on 1/5/16.
 */
public class Person {

    private String name;
    private String githubUserName;
    private String OS;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setGithubUserName(String githubUserName) {
        this.githubUserName = githubUserName;
    }

    public String getGithubUserName() {
        return githubUserName;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getOS() {
        return OS;
    }
}
