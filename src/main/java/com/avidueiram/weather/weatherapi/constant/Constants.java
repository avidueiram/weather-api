package com.avidueiram.weather.weatherapi.constant;

public class Constants {
    public static final String[] CITIES = new String[]{
            "Arica", // id: 1
            "Alto Hospicio", // id: 2
            "Iquique", // id: 3
            "Pozo Almonte", // id: 4
            "Caldera", // id: 5
            "Chanaral", // id: 6
            "Copiapo", // id: 7
            "Diego de Almagro", // id: 8
            "El Salvador", // id: 9
            "Huasco", // id: 10
            "Tierra Amarilla", // id: 11
            "Vallenar", // id: 12
            "Andacollo", // id: 13
            "Combarbala", // id: 14
            "Coquimbo", // id: 15
            "El Palqui", // id: 16
            "Illapel", // id: 17
            "La Serena", // id: 18
            "Los Vilos", // id: 19
            "Montepatria", // id: 20
            "Ovalle", // id: 21
            "Salamanca", // id: 22
            "Vicuna", // id: 23
            "Algarrobo", // id: 24
            "Cabildo", // id: 25
            "Calle Larga", // id: 26
            "Cartagena", // id: 27
            "Casablanca", // id: 28
            "Catemu", // id: 29
            "Concon", // id: 30
            "El Melon", // id: 31
            "El Quisco", // id: 32
            "El Tabo", // id: 33
            "Hijuelas", // id: 34
            "La Calera", // id: 35
            "La Cruz", // id: 36
            "La Ligua", // id: 37
            "Las Ventanas", // id: 38
            "Limache", // id: 39
            "Llaillay", // id: 40
            "Los Andes", // id: 41
            "Nogales", // id: 42
            "Olmue", // id: 43
            "Placilla de Penuelas", // id: 44
            "Putaendo", // id: 45
            "Quillota", // id: 46
            "Quilpue", // id: 47
            "Quintero", // id: 48
            "Rinconada", // id: 49
            "San Antonio", // id: 50
            "San Esteban", // id: 51
            "San Felipe", // id: 52
            "Santa Maria", // id: 53
            "Santo Domingo", // id: 54
            "Valparaiso", // id: 55
            "Villa Alemana", // id: 56
            "Villa Los Almendros", // id: 57
            "Vina del Mar", // id: 58
            "Chimbarongo", // id: 59
            "Codegua", // id: 60
            "Donihue", // id: 61
            "Graneros", // id: 62
            "Gultro", // id: 63
            "Las Cabras", // id: 64
            "Lo Miranda", // id: 65
            "Machali", // id: 66
            "Nancagua", // id: 67
            "Palmilla", // id: 68
            "Peumo", // id: 69
            "Pichilemu", // id: 70
            "Punta Diamante", // id: 71
            "Quinta de Tilcoco", // id: 72
            "Rancagua", // id: 73
            "Rengo", // id: 74
            "Requinoa", // id: 75
            "San Fernando", // id: 76
            "San Francisco de Mostazal", // id: 77
            "San Vicente de Tagua Tagua", // id: 78
            "Santa Cruz", // id: 79
            "Cauquenes", // id: 80
            "Constitucion", // id: 81
            "Curico", // id: 82
            "Hualane", // id: 83
            "Linares", // id: 84
            "Longavi", // id: 85
            "Molina", // id: 86
            "Parral", // id: 87
            "San Clemente", // id: 88
            "San Javier", // id: 89
            "Talca", // id: 90
            "Teno", // id: 91
            "Villa Alegre", // id: 92
            "Arauco", // id: 93
            "Bulnes", // id: 94
            "Cabrero", // id: 95
            "Canete", // id: 96
            "Chiguayante", // id: 97
            "Chillan", // id: 98
            "Chillan Viejo", // id: 99
            "Coelemu", // id: 100
            "Coihueco", // id: 101
            "Concepcion", // id: 102
            "Conurbacion La Laja-San Rosendo", // id: 103
            "Coronel", // id: 104
            "Curanilahue", // id: 105
            "Hualpen", // id: 106
            "Hualqui", // id: 107
            "Huepil", // id: 108
            "Lebu", // id: 109
            "Los alamos", // id: 110
            "Los angeles", // id: 111
            "Lota", // id: 112
            "Monte aguila", // id: 113
            "Mulchen", // id: 114
            "Nacimiento", // id: 115
            "Penco", // id: 116
            "Quillon", // id: 117
            "Quirihue", // id: 118
            "San Carlos", // id: 119
            "San Pedro de la Paz", // id: 120
            "Santa Barbara", // id: 121
            "Santa Juana", // id: 122
            "Talcahuano", // id: 123
            "Tome", // id: 124
            "Yumbel", // id: 125
            "Yungay", // id: 126
            "Angol", // id: 127
            "Carahue", // id: 128
            "Collipulli", // id: 129
            "Cunco", // id: 130
            "Curacautin", // id: 131
            "Freire", // id: 132
            "Gorbea", // id: 133
            "Labranza", // id: 134
            "Lautaro", // id: 135
            "Loncoche", // id: 136
            "Nueva Imperial", // id: 137
            "Padre Las Casas", // id: 138
            "Pitrufquen", // id: 139
            "Pucon", // id: 140
            "Puren", // id: 141
            "Renaico", // id: 142
            "Temuco", // id: 143
            "Traiguen", // id: 144
            "Victoria", // id: 145
            "Villarrica", // id: 146
            "Futrono", // id: 147
            "La Union", // id: 148
            "Lanco", // id: 149
            "Los Lagos", // id: 150
            "Paillaco", // id: 151
            "Panguipulli", // id: 152
            "Rio Bueno", // id: 153
            "San Jose de la Mariquina", // id: 154
            "Valdivia", // id: 155
            "Coihaique", // id: 156
            "Puerto Aisen", // id: 157
            "Punta Arenas", // id: 158
            "Puerto Natales", // id: 159
            "Alto Jahuel", // id: 160
            "Bajos de San Agustin", // id: 161
            "Batuco", // id: 162
            "Buin", // id: 163
            "Cerrillos", // id: 164
            "Cerro Navia", // id: 165
            "Colina", // id: 166
            "Conchali", // id: 167
            "Curacavi", // id: 168
            "El Bosque", // id: 169
            "El Monte", // id: 170
            "Estacion Central", // id: 171
            "Hospital", // id: 172
            "Huechuraba", // id: 173
            "Independencia", // id: 174
            "Isla de Maipo", // id: 175
            "La Cisterna", // id: 176
            "La Florida", // id: 177
            "La Granja", // id: 178
            "La Islita", // id: 179
            "La Pintana", // id: 180
            "La Reina", // id: 181
            "Lampa", // id: 182
            "Las Condes", // id: 183
            "Lo Barnechea", // id: 184
            "Lo Espejo", // id: 185
            "Lo Prado", // id: 186
            "Macul", // id: 187
            "Maipu", // id: 188
            "Melipilla", // id: 189
            "Nunoa", // id: 190
            "Padre Hurtado", // id: 191
            "Paine", // id: 192
            "Pedro Aguirre Cerda", // id: 193
            "Penaflor", // id: 194
            "Penalolen", // id: 195
            "Pirque", // id: 196
            "Providencia", // id: 197
            "Pudahuel", // id: 198
            "Puente Alto", // id: 199
            "Quilicura", // id: 200
            "Quinta Normal", // id: 201
            "Recoleta", // id: 202
            "Renca", // id: 203
            "San Bernardo", // id: 204
            "San Joaquin", // id: 205
            "San Jose de Maipo", // id: 206
            "San Miguel", // id: 207
            "San Ramon", // id: 208
            "Santiago", // id: 209
            "Talagante", // id: 210
            "Tiltil", // id: 211
            "Vitacura", // id: 212
            "Ancud", // id: 213
            "Calbuco", // id: 214
            "Castro", // id: 215
            "Fresia", // id: 216
            "Frutillar", // id: 217
            "Llanquihue", // id: 218
            "Los Muermos", // id: 219
            "Osorno", // id: 220
            "Puerto Montt", // id: 221
            "Puerto Varas", // id: 222
            "Purranque", // id: 223
            "Quellon", // id: 224
            "Rio Negro", // id: 225
            "Antofagasta", // id: 226
            "Calama", // id: 227
            "Maria Elena", // id: 228
            "Mejillones", // id: 229
            "Taltal", // id: 230
            "Tocopilla" // id: 231
    };
}
