#Model-View-ViewModel

- The View — that informs the ViewModel about the user’s actions
- The ViewModel — exposes streams of data relevant to the View
- The DataModel — abstracts the data source. The ViewModel works with the DataModel to get and save the data.

--------------------------------------------------------------------------------------------------------------------------

![Flow 1](https://github.com/mksantoki/MVVMDEMO/blob/master/img/step_one.png)

###### Flow 1

- View -> View will your activity or fragment
- ViewModel -> ViewModel is used to transfer data between view and datamodel
- DataModel -> Datamodel is used to perform business login
- Model -> Mode class is a structure of data

![Flow 2](https://github.com/mksantoki/MVVMDEMO/blob/master/img/step_two.png)

-> View (Activity/Fragment) request to ViewModel. ViewModel request to the repository. repository request data according to requirements like offline data and online data. Offline data (Model) means database or static data. Remote data means API calls and other online data storage.
