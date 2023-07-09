# WHAT?
Get the preconfigured OTP automatically in just 1 click, the OTP will be copied automatically, and you can paste on your application easily.

You no longer have to:
- Copy and paste your secret key, open a totp page on web browser, generate am OTP, copy and paste the generated OTP onto your application
- Open your favourite password manager application, click to generate OTP, copy and paste the generated OTP onto your application

# Prerequisite 
You will need to have your secret key associated with your account before running this tool

# HOW TO?

Configure the secret:
Use either the following method:
- Open secret file and update your secret string as the file content
- Edit the GetOTP.cmd file and add the secret string to the command as the parameter. See **Run the project** section below.

Build the project:

```bash
mvn package
```

Run the project with terminal:

```bash
java -jar target/otp-generator-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Quick run the project: Update the **GetOTP.cmd** file with following content:
```bash
java -jar target/otp-generator-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Quick run the project with customized secret string: Update the **GetOTP.cmd** file with following content, and replace the sample secret string with your secret string:
```bash
java -jar target/otp-generator-1.0-SNAPSHOT-jar-with-dependencies.jar JBSWY3DPEHPK3PXPJBSWY3DPEHPK3PXP
```

Attach the command above into a Batch or Command file. Single click onto the command file will get the OTP automatically.
