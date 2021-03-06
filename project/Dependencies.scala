import sbt._

object Dependencies {
  lazy val Examples = config("example") extend Compile

  val nettyVersion = "4.1.6.Final"
  val slf4jVersion = "1.7.12"
  val nettyAll    = "io.netty"      % "netty-all" 			  % nettyVersion  % Compile
  val nettyHttp   = "io.netty"      % "netty-codec-http" 	% nettyVersion  % Compile
  val slf4jApi    = "org.slf4j"     % "slf4j-api"         % slf4jVersion  % Compile
  val slf4jSimple = "org.slf4j"     % "slf4j-simple"      % slf4jVersion  % Examples
  val scalaStm    = "org.scala-stm" %% "scala-stm"        % "0.8"         % Compile

  val all = Seq(nettyAll, nettyHttp, scalaStm, slf4jApi, slf4jSimple)
}