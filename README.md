#  Under Development , don't use it :)

# react-native-jalali-datepicker

## Getting started

`$ npm install react-native-jalali-datepicker --save`

### Mostly automatic installation

`$ react-native link react-native-jalali-datepicker`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-jalali-datepicker` and add `RNJalaliDatepicker.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNJalaliDatepicker.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNJalaliDatepickerPackage;` to the imports at the top of the file
  - Add `new RNJalaliDatepickerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-jalali-datepicker'
  	project(':react-native-jalali-datepicker').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-jalali-datepicker/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-jalali-datepicker')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNJalaliDatepicker.sln` in `node_modules/react-native-jalali-datepicker/windows/RNJalaliDatepicker.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Jalali.Datepicker.RNJalaliDatepicker;` to the usings at the top of the file
  - Add `new RNJalaliDatepickerPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNJalaliDatepicker from 'react-native-jalali-datepicker';

// TODO: What to do with the module?
RNJalaliDatepicker;
```
  
