# Axon Micrometer Metrics Issue Demo
This project demonstrates an issue with missing metrics and tags after updating Axon Console from version 1.5.1 to 1.5.2. The problem occurs when Micrometer is used with Axon and Axon Console

## Overview
This demo project includes a simple Spring Boot application with Micrometer, Prometheus, Axon and Axon Console integrated. It showcases how custom tags and metrics behave differently between Axon Console versions 1.5.1 and 1.5.2.

## Getting Started
1. Clone the repository:
```sh
git clone https://github.com/lachja/axon-micrometer-metrics-issue-demo.git
cd axon-micrometer-metrics-issue-demo
```
2. Connect the Application to Axon Server and Axon Console
3. Run the application with Axon Console 1.5.1
4. Update the build.gradle file to include Axon Console version 1.5.2 and run the application again

## Observing Metrics
Access the /actuator/prometheus endpoint to view the metrics.
Compare the outputs between version 1.5.1 and 1.5.2.

I've written my output of these endpoint in metrics_1.5.1.txt and metrics_1.5.2.txt.

It is noticeable that many standard metrics such as JVM metrics, system metrics, logback metrics and more are lost. What remains are Axon metrics, HTTP server metrics, Tomcat metrics and task metrics. However, all metrics no longer have metric tags.