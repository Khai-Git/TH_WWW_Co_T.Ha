USE [master]
GO

/****** Object:  Database [web_customer_tracker]    Script Date: 11/6/2023 10:38:58 AM ******/
CREATE DATABASE [web_customer_tracker]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'web_customer_tracker', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\web_customer_tracker.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'web_customer_tracker_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\web_customer_tracker_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO

ALTER DATABASE [web_customer_tracker] SET COMPATIBILITY_LEVEL = 110
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [web_customer_tracker].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ARITHABORT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_CREATE_STATISTICS ON 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [web_customer_tracker] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [web_customer_tracker] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [web_customer_tracker] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [web_customer_tracker] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [web_customer_tracker] SET  DISABLE_BROKER 
GO

ALTER DATABASE [web_customer_tracker] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [web_customer_tracker] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [web_customer_tracker] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [web_customer_tracker] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [web_customer_tracker] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [web_customer_tracker] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [web_customer_tracker] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [web_customer_tracker] SET RECOVERY FULL 
GO

ALTER DATABASE [web_customer_tracker] SET  MULTI_USER 
GO

ALTER DATABASE [web_customer_tracker] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [web_customer_tracker] SET DB_CHAINING OFF 
GO

ALTER DATABASE [web_customer_tracker] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [web_customer_tracker] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO

ALTER DATABASE [web_customer_tracker] SET  READ_WRITE 
GO

