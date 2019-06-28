   <div class="pcoded-content">
                        <!-- Page-header start -->
                        <div class="page-header">
                            <div class="page-block">
                                <div class="row align-items-center">
                                    <div class="col-md-8">
                                        <div class="page-header-title">
                                            <h5 class="m-b-10">Upload Jurnal Koreksi</h5>
                                            <p class="m-b-0">Mekanisme koreksi jurnal</p>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <ul class="breadcrumb-title">
                                            <li class="breadcrumb-item">
                                                <a href="index.html"> <i class="fa fa-home"></i> </a>
                                            </li>
                                            <li class="breadcrumb-item"><a href="#!">Worksheet</a>
                                            </li>
                                            <li class="breadcrumb-item"><a href="#!">Upload Jurnal Koreksi</a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Page-header end -->
                        <div class="pcoded-inner-content">
                            <!-- Main-body start -->
                            <div class="main-body">
                                <div class="page-wrapper">
                                    <!-- Page-body start -->
                                    <div class="page-body">
										<div class="card">
											<div class="card-header">
												<h5>Upload Jurnal Koreksi</h5>
												<span>Mekanisme koreksi jurnal</span>
											</div>
											<div class="card-block">
												<h4 class="sub-title">&nbsp;</h4>
												<form>
												
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Tanggal Data</label>
														<div class="col-sm-10">
															<div class="input-group date" id="datetimepicker1">
																<input class="form-control" type="date" name="bday">
																
																<span class="input-group-addon">
																	<i class="ti-calendar"></i>	
																</span>
															</div>
														</div>
													</div>
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Tipe</label>
														<div class="col-sm-10">
															<select name="select" class="form-control">
																<option value="opt1">Select One Value Only</option>
																<option value="opt2">G</option>
																<option value="opt3">I</option>
															</select>
														</div>
													</div>
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Sandi Lapor</label>
														<div class="col-sm-10">
															<select name="select" class="form-control">
																<option value="opt1">Select One Value Only</option>
																<option value="opt2">001</option>
																<option value="opt3">003</option>
																<option value="opt4">005</option>
																<option value="opt5">006</option>
																<option value="opt6">007</option>
																<option value="opt7">010</option>
																<option value="opt8">011</option>
																<option value="opt8">013</option>
																<option value="opt8">019</option>
															</select>
														</div>
													</div>
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Kode Cabang</label>
														<div class="col-sm-10">
															<select name="select" class="form-control">
																<option value="opt1">Select One Value Only</option>
																<option value="opt2">00600</option>
																<option value="opt3">00601</option>
																<option value="opt4">00602</option>
																<option value="opt5">00603</option>
																<option value="opt6">00605</option>
																<option value="opt7">00607</option>
																<option value="opt8">00609</option>
															</select>
														</div>
													</div>
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Upload File</label>
														<div class="col-sm-10">
															<input type="file" class="form-control">
														</div>
													</div>
													<!--
													<div class="form-group row">
														<label class="col-sm-2 col-form-label">Sandi Lapor</label>
														<div class="col-sm-10">
															<select name="select" class="form-control">
																<option value="opt1">Select One Value Only</option>
																<option value="opt2">AAA</option>
																<option value="opt3">BBB</option>
																<option value="opt4">CCC</option>
																<option value="opt5">DDD</option>
																<option value="opt6">EEE</option>
																<option value="opt7">FFF</option>
																<option value="opt8">others</option>
															</select>
														</div>
													</div>
													-->
													<div>
														<button type="button" onclick="window.location.href='/antasena-reporting-app/upload-jurnal-koreksi.html'" class="btn btn-primary waves-effect waves-light">Upload</button>
														&nbsp;&nbsp;&nbsp;
														<button type="button" onclick="window.location.href='/antasena-reporting-app/upload-jurnal-koreksi.html'" class="btn btn-primary waves-effect waves-light">&nbsp;&nbsp;Save&nbsp;&nbsp;</button>
													</div>
												</form>
															
											</div>
										</div>
                                        <!-- Hover table card start -->
                                        <div class="card">
                                            <div class="card-header">
                                                <!--<h5>&nbsp;</h5>
                                                <span>&nbsp;</span>-->
                                                <div class="card-header-right">
                                                    <ul class="list-unstyled card-option">
                                                        <li><i class="fa fa fa-wrench open-card-option"></i></li>
                                                        <li><i class="fa fa-window-maximize full-card"></i></li>
                                                        <li><i class="fa fa-minus minimize-card"></i></li>
                                                        <li><i class="fa fa-refresh reload-card"></i></li>
                                                        <li><i class="fa fa-trash close-card"></i></li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <div class="card-block table-border-style">
                                                <div class="table-responsive">
                                                    <table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>#</th>
                                                                <th>Tanggal Data</th>
                                                                <th>Tipe</th>
                                                                <th>Sandi Lapor</th>
																<th>Kode Cabang</th>
																<th>Sandi LBU</th>
																<th>No GL</th>
																<th>Keterangan GL</th>
																<th>Kode Valuta</th>
																<th>Jumlah Debet Koreksi</th>
																<th>Jumlah Kredit Koreksi</th>
																<th>Kode Jurnal</th>
																<th>Keterangan</th>
																<th>Korektor</th>
																<th>Tanggal Import</th>
																<th>Action</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <tr>
                                                                <th scope="row">1</th>
                                                                <td>30-04-2019</td>
																<td>I</td>
																<td>767</td>
																<td>60300</td>
																<td>101444086</td>
																<td>14021101-2-00</td>
																<td>OBL. PEM. DIMILIKI HINGGA JT</td>
																<td>USD</td>
																<td>0</td>
																<td>0</td>
																<td>REKLAS SURAT BERHARGA</td>
																<td>Koreksi SB kategori pengukuran Trading ke HTM (T BOND RI 2016 & 2017)</td>
																<td>Henidazilfa</td>
																<td>2019-05-03 17:15:27.093</td>
																<td>
																	<button class="btn waves-effect waves-light btn-primary btn-icon">U</button>
																	<button class="btn waves-effect waves-light btn-danger btn-icon">D</button>
																</td>
                                                            </tr>
                                                            <tr>
                                                                <th scope="row">2</th>
                                                                <td>30-04-2019</td>
																<td>I</td>
																<td>767</td>
																<td>60300</td>
																<td>101444083</td>
																<td>13023101-2-00</td>
																<td>EFEK2 DHG. JT. SBPM OBLIGASI</td>
																<td>USD</td>
																<td>0</td>
																<td>0</td>
																<td>REKLAS SURAT BERHARGA</td>
																<td>Koreksi SB kategori pengukuran Trading ke HTM (T BOND RI 2016 & 2017)</td>
																<td>Henidazilfa</td>
																<td>2019-05-03 17:15:27.093</td>
																<td>
																	<button class="btn waves-effect waves-light btn-primary btn-icon">U</button>
																	<button class="btn waves-effect waves-light btn-danger btn-icon">D</button>
																</td>
                                                            </tr>
                                                            <tr>
                                                                <th scope="row">3</th>
                                                                <td>30-04-2019</td>
																<td>I</td>
																<td>767</td>
																<td>60300</td>
																<td>102230050</td>
																<td>19611207-2-09</td>
																<td>INTER OFFICE ASSETS - ACCRUED INTEREST INCOME</td>
																<td>USD</td>
																<td>4940215365</td>
																<td>0</td>
																<td>REKLAS RAK</td>
																<td>Jurnal Reklas RAK_sesuai BSPL</td>
																<td>Henidazilfa</td>
																<td>2019-05-03 17:15:27.093</td>
																<td>
																	<button class="btn waves-effect waves-light btn-primary btn-icon">U</button>
																	<button class="btn waves-effect waves-light btn-danger btn-icon">D</button>
																</td>
                                                            </tr>
															<tr>
                                                                <th scope="row">4</th>
                                                                <td>30-04-2019</td>
																<td>I</td>
																<td>767</td>
																<td>60300</td>
																<td>102240095</td>
																<td>19611207-2-00</td>
																<td>INTER OFFICE ASSETS - ACCRUED INTEREST INCOME</td>
																<td>USD</td>
																<td>0</td>
																<td>4940215365</td>
																<td>REKLAS RAK</td>
																<td>Jurnal Reklas RAK_sesuai BSPL</td>
																<td>Henidazilfa</td>
																<td>2019-05-03 17:15:27.093</td>
																<td>
																	<button class="btn waves-effect waves-light btn-primary btn-icon">U</button>
																	<button class="btn waves-effect waves-light btn-danger btn-icon">D</button>
																</td>			
                                                            </tr>
															<tr>
                                                                <th scope="row">5</th>
                                                                <td>30-04-2019</td>
																<td>I</td>
																<td>767</td>
																<td>60300</td>
																<td>103940025</td>
																<td>29611204-2-00</td>
																<td>INTER OFFICE LIABILITIES - DEPOSIT TAKEN</td>
																<td>USD</td>
																<td>2394000000000</td>
																<td>0</td>
																<td>REKLAS RAK</td>
																<td>Jurnal Reklas RAK_sesuai BSPL</td>
																<td>Henidazilfa</td>
																<td>2019-05-03 17:15:27.093</td>
																<td>
																	<button class="btn waves-effect waves-light btn-primary btn-icon">U</button>
																	<button class="btn waves-effect waves-light btn-danger btn-icon">D</button>
																</td>

                                                            </tr>
															
                                                        </tbody>
														
                                                    </table>
													
													<!--<div><button type="button" onclick="window.location.href='/antasena-reporting-app/usr-mgt-add.html'" class="btn btn-primary waves-effect waves-light">Add</button></div>-->
                                                </div>
                                            </div>
                                        </div>
                                        <!-- Hover table card end -->
                                        
                                    </div>
                                    <!-- Page-body end -->
                                </div>
                            </div>
                            <!-- Main-body end -->

                            <div id="styleSelector">

                            </div>
                        </div>
</div>
              