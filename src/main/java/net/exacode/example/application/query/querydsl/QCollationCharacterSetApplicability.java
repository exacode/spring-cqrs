package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QCollationCharacterSetApplicability is a Querydsl query type for QCollationCharacterSetApplicability
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QCollationCharacterSetApplicability extends com.mysema.query.sql.RelationalPathBase<QCollationCharacterSetApplicability> {

    private static final long serialVersionUID = -1217933689;

    public static final QCollationCharacterSetApplicability collationCharacterSetApplicability = new QCollationCharacterSetApplicability("collation_character_set_applicability");

    public final SimplePath<Object> characterSetCatalog = createSimple("character_set_catalog", Object.class);

    public final SimplePath<Object> characterSetName = createSimple("character_set_name", Object.class);

    public final SimplePath<Object> characterSetSchema = createSimple("character_set_schema", Object.class);

    public final SimplePath<Object> collationCatalog = createSimple("collation_catalog", Object.class);

    public final SimplePath<Object> collationName = createSimple("collation_name", Object.class);

    public final SimplePath<Object> collationSchema = createSimple("collation_schema", Object.class);

    public QCollationCharacterSetApplicability(String variable) {
        super(QCollationCharacterSetApplicability.class, forVariable(variable), "information_schema", "collation_character_set_applicability");
    }

    @SuppressWarnings("all")
    public QCollationCharacterSetApplicability(Path<? extends QCollationCharacterSetApplicability> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "collation_character_set_applicability");
    }

    public QCollationCharacterSetApplicability(PathMetadata<?> metadata) {
        super(QCollationCharacterSetApplicability.class, metadata, "information_schema", "collation_character_set_applicability");
    }

}

