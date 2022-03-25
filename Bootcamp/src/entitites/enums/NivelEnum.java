package entitites.enums;

public enum NivelEnum {

    BASICO(1, "BASICO"), INTERMEDIARIO(2, "INTERMEDIARIO"), AVANCADO(3, "AVANCADO");

    private int cod;
    private String desc;

    private NivelEnum(int cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public static NivelEnum toEnum(String desc) {

        if (desc == null) {
            return null;
        }

        for (NivelEnum index : NivelEnum.values()) {

            if (desc.equals(index.getDesc())) {
                return index;
            }
        }

        throw new IllegalArgumentException("Enum inválido: " + desc);
    }

    public static NivelEnum toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (NivelEnum index : NivelEnum.values()) {

            if (cod.equals(index.getCod())) {
                return index;
            }
        }

        throw new IllegalArgumentException("Enum inválido: " + cod);
    }

}
