<h1>University Cafeteria Table Reservation System – Project251</h1>

<h2>📌 Overview</h2>
<p><strong>Project251</strong> is a Java-based <strong>University Cafeteria Table Reservation and Ordering System</strong>.<br>
It allows students and staff to view the cafeteria menu, place food orders, reserve tables in advance, and process payments efficiently.<br>
The system simulates a real-life cafeteria workflow and is designed as a <strong>Java console application</strong> with a modular, object-oriented structure.</p>

<hr>

<h2>✨ Features</h2>
<ul>
<li><strong>Menu Display</strong> – Shows available cafeteria food and drink options.</li>
<li><strong>Table Reservation</strong> – Students and staff can reserve cafeteria tables before arrival.</li>
<li><strong>Order Placement</strong> – Allows adding, removing, and viewing orders.</li>
<li><strong>Payment Processing</strong> – Calculates total cost and issues a receipt.</li>
<li><strong>Unit Testing</strong> – Includes JUnit tests for major system functions.</li>
</ul>

<hr>

<h2>🛠️ Technologies Used</h2>
<ul>
<li><strong>Java SE</strong> – Core language for implementation.</li>
<li><strong>JUnit</strong> – For testing core functionality.</li>
<li><strong>NetBeans</strong> – Recommended IDE (project is pre-configured).</li>
</ul>

<hr>

<h2>📂 Project Structure</h2>
<pre>
project251/
 ├── src/project251/
 │   ├── Menu.java                     # Cafeteria menu logic
 │   ├── Payment.java                   # Payment calculations
 │   ├── Project251.java                # Main entry point
 │   ├── TableReservation.java          # Table reservation data
 │   ├── TableReservationSystem.java    # Reservation system logic
 │   ├── order.java                     # Order handling
 │
 ├── test/project251/                   # Unit tests
 │   ├── MenuTest.java
 │   ├── PaymentTest.java
 │   ├── TableReservationSystemTest.java
 │   ├── orderTest.java
 │
 ├── build.xml                         
 ├── manifest.mf                        # Java manifest file
 └── .gitignore
</pre>

<hr>

<h2>🚀 How to Run</h2>
<ol>
<li>Install <strong>JDK 8 or newer</strong>.</li>
<li>Open the project in <strong>NetBeans</strong> (or any Java IDE).</li>
<li>Build and run:
<pre><code>ant run</code></pre></li>
<li>Use the console menu to:
<ul>
<li>View the cafeteria menu.</li>
<li>Reserve a table.</li>
<li>Place an order.</li>
<li>Make payment.</li>
</ul>
</li>
</ol>

<hr>

<h2>🧪 Running Tests</h2>
<p>To execute unit tests:</p>
<pre><code>ant test</code></pre>
<p>Or run them directly in NetBeans using the JUnit test runner.</p>

<hr>

<h2>🎯 Educational Purpose</h2>
<p>This project was created as part of a <strong>university coursework</strong> to demonstrate Java programming, object-oriented design, and basic software testing.</p>
